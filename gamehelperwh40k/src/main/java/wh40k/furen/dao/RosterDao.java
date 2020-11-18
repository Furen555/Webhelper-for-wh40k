package wh40k.furen.dao;

import java.util.List;

import wh40k.furen.models.Roster;

public interface RosterDao {

	Roster getRosterById(Long rosterId);

	List<Roster> getAllRosters();

	boolean update(Long rosterId);

	boolean remove(Long rosterId);

}
