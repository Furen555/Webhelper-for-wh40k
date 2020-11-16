package wh40k.furen.dao;

import java.util.List;

import wh40k.furen.models.Account;
import wh40k.furen.models.Roster;

public interface AccountDao {

	Account getAccountByLogin(String login);

	boolean remove(Long accountId);

	List<Roster> getAllRosters();

}
