package wh40k.furen.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wh40k.furen.models.Roster;

@WebServlet("/user/home")
public class HomeController extends AbstractController {

	private static final long serialVersionUID = 1L;

	// ������
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Roster> rosters = getUserService().getAllRosters();
		req.setAttribute("rosters", rosters);
		forwardToPage("user/HomePage.jsp", req, resp);
	}

}
