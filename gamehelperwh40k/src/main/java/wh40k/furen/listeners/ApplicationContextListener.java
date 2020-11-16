package wh40k.furen.listeners;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

import wh40k.furen.context.ApplicationContext;

@WebListener
public class ApplicationContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		ApplicationContext.getApplicationContext(sce.getServletContext());
		System.out.println("Webapp started");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("dont forget to close all connections");
		ApplicationContext.getApplicationContext(sce.getServletContext()).ShutDown();
	}

}
