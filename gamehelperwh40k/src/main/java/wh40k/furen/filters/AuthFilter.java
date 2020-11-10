package wh40k.furen.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wh40k.furen.Constants;
import wh40k.furen.models.Account;

@WebFilter(filterName = "AuthFilter")
public class AuthFilter extends AbstractFilter {

	@Override
	public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		String reqUri = req.getRequestURI();
		Account currentAcc = (Account) req.getSession().getAttribute(Constants.CURRENT_ACCOUNT);
		chain.doFilter(req, resp);

	}

}
