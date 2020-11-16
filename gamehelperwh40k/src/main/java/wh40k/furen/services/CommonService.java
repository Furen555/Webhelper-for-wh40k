package wh40k.furen.services;

import wh40k.furen.exceptions.ValidationException;
import wh40k.furen.models.Account;

public interface CommonService {
	
	Account login(String login, String password) throws ValidationException;

}
