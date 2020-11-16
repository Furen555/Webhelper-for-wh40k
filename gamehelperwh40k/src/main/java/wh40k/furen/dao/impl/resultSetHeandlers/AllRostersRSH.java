package wh40k.furen.dao.impl.resultSetHeandlers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.ResultSetHandler;

import wh40k.furen.models.Roster;

public class AllRostersRSH implements ResultSetHandler<List<Roster>> {

	@Override
	public List<Roster> handle(ResultSet rs) throws SQLException {
		List<Roster> result = new ArrayList<>();
		while (rs.next()) {
			Roster roster = new Roster();
			roster.setId(rs.getLong("id"));
			roster.setName(rs.getString("name"));
			roster.setFraction(rs.getString("fraction"));
			result.add(roster);

		}

		return result;
	}

}
