package wh40k.furen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wh40k.furen.models.Weapon;

@WebServlet("/addweapon")
public class AddNewWeaponController extends AbstractController {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		forwardToPage("user/AddWeapon.jsp", req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Weapon weapon = new Weapon();
			weapon.setName(req.getParameter("name"));
			weapon.setRange(req.getParameter("range"));
			weapon.setType(req.getParameter("type"));
			weapon.setS(req.getParameter("s"));
			weapon.setAp(req.getParameter("ap"));
			weapon.setD(req.getParameter("d"));
			weapon.setAbilitys(req.getParameter("ability"));
			weapon.setFraction(req.getParameter("fraction"));
			getWeaponService().addNewWeapon(weapon);
			resp.sendRedirect("/user/home");
		} catch (Exception e) {
			resp.sendRedirect("/user/home");

		}

	}

}
