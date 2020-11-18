package wh40k.furen.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wh40k.furen.context.ApplicationContext;
import wh40k.furen.listeners.ApplicationContextListener;
import wh40k.furen.services.CommonService;
import wh40k.furen.services.UserService;
import wh40k.furen.services.WeaponService;

public class AbstractController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private ApplicationContext applicationContext;

	@Override
	public void init() throws ServletException {
		applicationContext = ApplicationContext.getApplicationContext(getServletContext());
		initServlet();

	}

	protected void initServlet() throws ServletException {
	}

//ГОТОВ(сделан для pagetemplate, чтобы не дублировать html код тела каждой страницы)
	protected void forwardToPage(String pageName, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("currentPage", "/WEB-INF/views/" + pageName);
		req.getRequestDispatcher("/WEB-INF/views/page-template.jsp").forward(req, resp);
	}

	public CommonService getCommonService() {
		return applicationContext.getCommonService();
	}

	public UserService getUserService() {
		return applicationContext.getUserService();
	}

	public WeaponService getWeaponService() {
		return applicationContext.getWeaponService();
	}

}
