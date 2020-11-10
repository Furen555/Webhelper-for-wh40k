package wh40k.furen.listeners;

import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextListener sce) {
		System.out.println("Webapp started");
	}

	public void contextDestroyed(ServletContextListener sce) {
		System.out.println("dont forget to close allconnections");
	}

}
