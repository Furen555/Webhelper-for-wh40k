package wh40k.furen.dao.impl.resultSetHeandlers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.ResultSetHandler;

import wh40k.furen.models.Account;

public class UserResultSetHeandler implements ResultSetHandler<Account> {

	@Override
	public Account handle(ResultSet rs) throws SQLException {
		Account result = new Account();
		if (rs.next()) {
			result.setId(rs.getLong("id"));
			result.setLogin(rs.getString("name"));
			result.setMail(rs.getString("mail"));
			result.setPassword(rs.getString("password"));
			return result;

		} else {
			return null;
		}

	}

}
