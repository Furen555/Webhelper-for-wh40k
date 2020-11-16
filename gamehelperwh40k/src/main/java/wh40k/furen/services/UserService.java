package wh40k.furen.services;

import java.util.List;

import wh40k.furen.models.Account;
import wh40k.furen.models.Roster;

public interface UserService {

	List<Roster> getAllRosters();

	boolean remove(Account account);

}
