package wh40k.furen.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;

@WebListener
public class ApplicationSessionListener implements HttpSessionIdListener {

	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Created" + se.getSession().getId());
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Destroyed" + se.getSession().getId());
	}

	public void sessionIdChanged(HttpSessionEvent event, String oldSessionId) {
		// TODO Auto-generated method stub

	}
}
