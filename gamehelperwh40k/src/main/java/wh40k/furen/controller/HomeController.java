package wh40k.furen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController extends AbstractController {

	private static final long serialVersionUID = 1L;

	//√Œ“Œ¬Œ
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		forwardToPage("user/HomePage.jsp", request, response);
		
		;
	}
	
	

}
