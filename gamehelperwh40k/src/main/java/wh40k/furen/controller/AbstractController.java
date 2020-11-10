package wh40k.furen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AbstractController extends HttpServlet {

	private static final long serialVersionUID = 1L;

//ГОТОВ(сделан для pagetemplate, чтобы не дублировать html код тела каждой страницы)
	protected void forwardToPage(String pageName, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("currentPage", "/WEB-INF/views/" + pageName);
		req.getRequestDispatcher("/WEB-INF/views/page-template.jsp").forward(req, resp);
	}

}
