package wh40k.furen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/index.html", "/gamehelperwh40k" })
public class IndexController extends HttpServlet {

	private static final long serialVersionUID = 1L;

//ловит переход по root пути и направляет запрос на страничку логина
	// ГОТОВ
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("/login");
	}

}
