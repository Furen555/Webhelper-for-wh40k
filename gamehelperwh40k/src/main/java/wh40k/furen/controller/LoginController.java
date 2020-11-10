package wh40k.furen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wh40k.furen.Constants;
import wh40k.furen.models.Account;

@WebServlet("/login")
public class LoginController extends AbstractController {

	private static final long serialVersionUID = 1L;

	// �����
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Account currentAcc = (Account) request.getSession().getAttribute(Constants.CURRENT_ACCOUNT);
		if (currentAcc == null) {
			forwardToPage("Login.jsp", request, response);
		} else {
			response.sendRedirect("/user/home");
		}

		// ���������� ��� ����� �� ����� ����������� �� �������� �����. ������������ ���
		// ��������� ������ �� ���� �� ����,
		// request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request,
		// response); �� ������� ���� ����� abstract controller � � ��� �����
		// forwardtopage, ������� ������ ���� �����

	}

	// �� �����, �������� ���������� ������
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Account user = new Account();
		user.setLogin(request.getParameter("login"));
		user.setPassword(request.getParameter("password"));
		request.getSession().setAttribute(Constants.CURRENT_ACCOUNT, user);

		response.sendRedirect("/user/home");

		// ���������� ����� ��� ������ �� �������� �����(��� ������
		// ����������).������������ ��� ��������� ����� ��������� ����� ��������� �����
		// ���� ������ ������� ���� � ����������(������ � ��, ��������� � �.�.)

	}
}
