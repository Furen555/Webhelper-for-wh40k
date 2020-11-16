package wh40k.furen.services.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import wh40k.furen.dao.AccountDao;
import wh40k.furen.exceptions.ApplicationException;
import wh40k.furen.exceptions.ValidationException;
import wh40k.furen.models.Account;
import wh40k.furen.services.CommonService;
import wh40k.furen.utils.ConnectionUtils;

public class CommonServiceImpl implements CommonService {
	private final DataSource dataSource;
	private final AccountDao accountDao;

	public CommonServiceImpl(DataSource dataSource, AccountDao accountDao) {
		this.dataSource = dataSource;
		this.accountDao = accountDao;
	}

	public Account login(String login, String password) throws ValidationException {
		try (Connection connection = dataSource.getConnection()) {
			ConnectionUtils.setConnection(connection);
			
			//if we nead transeaction
			//connection.setAutoCommit(false);
			Account account = accountDao.getAccountByLogin(login);
			if (account == null) {
				throw new ValidationException("you haven't account");
			} else {
				if (!account.getPassword().equals(password)) {
					throw new ValidationException("you write wrong password");
				}
			}
			//connection.commit();
			return account;

		} catch (SQLException e) {
			throw new ApplicationException("Exeption during login of account with login:" + login, e);
		}
	}

}
