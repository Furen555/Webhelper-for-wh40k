package wh40k.furen.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import wh40k.furen.dao.AccountDao;
import wh40k.furen.dao.impl.resultSetHeandlers.AllRostersRSH;
import wh40k.furen.dao.impl.resultSetHeandlers.UserResultSetHeandler;
import wh40k.furen.exceptions.ApplicationException;
import wh40k.furen.models.Account;
import wh40k.furen.models.Roster;
import wh40k.furen.utils.ConnectionUtils;

public class AccountDaoImpl implements AccountDao {
	// select-query,insert-insert,update/dell-update
	private final QueryRunner queryRunner = new QueryRunner();

	private String selectCurrentAccount = "SELECT * FROM account WHERE name=?";
	private String selectAllRosters = "SELECT * FROM roster";

	public Account getAccountByLogin(String login) {
		Connection connection = ConnectionUtils.getConnection();
		try {
			return queryRunner.query(connection, selectCurrentAccount, new UserResultSetHeandler(), login);
		} catch (SQLException e) {
			throw new ApplicationException(e);
		}

	}

	@Override
	public boolean remove(Long accountId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Roster> getAllRosters() {
		Connection conntction = ConnectionUtils.getConnection();
		try {
			return queryRunner.query(conntction, selectAllRosters, new AllRostersRSH());
		} catch (SQLException e) {
			throw new ApplicationException(e);
		}

	}

}
