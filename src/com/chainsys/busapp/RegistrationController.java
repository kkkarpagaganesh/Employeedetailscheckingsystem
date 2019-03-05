package com.chainsys.busapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirm_password = request.getParameter("confirm password");

		UserDao userdao = new UserDao();
		User user = new User();

		user.setName(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setConfirm_password(confirm_password);

		

		if ((username != null) && (email != null)) {
			if (password.contentEquals(confirm_password)) {
				RequestDispatcher rd = request
						.getRequestDispatcher("Login.html");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request
						.getRequestDispatcher("signupfailure.html");
				rd.forward(request, response);
			}
			userdao.Singnup(user);
		}

	}
}