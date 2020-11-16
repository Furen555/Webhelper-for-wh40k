package wh40k.furen.services.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import wh40k.furen.dao.AccountDao;
import wh40k.furen.dao.ResultDao;
import wh40k.furen.exceptions.ApplicationException;
import wh40k.furen.models.Account;
import wh40k.furen.models.Roster;
import wh40k.furen.services.UserService;
import wh40k.furen.utils.ConnectionUtils;

public class UserServiceImpl implements UserService {

	private final DataSource dataSource;
	private final AccountDao accountDao;
	private final ResultDao resultDao;

	public UserServiceImpl(DataSource dataSource, AccountDao accountDao, ResultDao resultDao) {
		this.dataSource = dataSource;
		this.accountDao = accountDao;
		this.resultDao = resultDao;
	}

	public boolean remove(Account account) {
		try (Connection connection = dataSource.getConnection()) {
			connection.setAutoCommit(false);
			ConnectionUtils.setConnection(connection);
			accountDao.remove(account.getId());
			resultDao.removeAllAccontResult(account.getId());
			connection.commit();
			return true;
		} catch (SQLException e) {
			throw new ApplicationException("Error with removing account by ID:" + account.getId(), e);
		} finally {
			ConnectionUtils.cleanConnection();
		}
	}

	@Override
	public List<Roster> getAllRosters() {
		try (Connection connection = dataSource.getConnection()) {
			ConnectionUtils.setConnection(connection);
			return accountDao.getAllRosters();
		} catch (SQLException e) {
			throw new ApplicationException("Error with removing account by ID:", e);
		} finally {
			ConnectionUtils.cleanConnection();
		}
	}

}
