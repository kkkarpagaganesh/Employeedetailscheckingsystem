package com.chainsys.busapp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecretController
 */
@WebServlet("/SecretController")
public class SecretController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecretController() {
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
		int id=Integer.parseInt(request.getParameter("Id"));
		int code=Integer.parseInt(request.getParameter("password"));
		
		Loginvalidation log = new Loginvalidation();
		
		try {
		boolean result=	log.signupValidator(id,code);
		System.out.println("result="+result);
		if(result){
			RequestDispatcher rd=request.getRequestDispatcher("Signup.html");
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


