package com.chainsys.busapp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
	//	PrintWriter out=response.getWriter();
	//	response.getWriter().println(email);
	//	response.getWriter().println(password);
	
		Loginvalidation log = new Loginvalidation();
	
		try {
		boolean result=	log.loginValidator(email,password);
		if(result){
			HttpSession session=request.getSession();
			session.setAttribute("email", email);
			RequestDispatcher rd=request.getRequestDispatcher("selectlist.jsp");
			rd.forward(request, response);
		}else{
			
			RequestDispatcher rd=request.getRequestDispatcher("expire.jsp");
			rd.forward(request, response);
			
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 
					e.printStackTrace();
		}

	}

}
