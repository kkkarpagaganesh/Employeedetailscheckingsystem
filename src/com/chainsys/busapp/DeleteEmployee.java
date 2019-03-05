package com.chainsys.busapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployee() {
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
		
		UserDao userdao = new UserDao();
		User user=new User();
		
		user.setId(id);
		try {
			userdao.delete(user);
			System.out.println("DELETED SUCCESSFULLY!!!!!!!!");
			RequestDispatcher rd=request.getRequestDispatcher("deletion.html");
			rd.forward(request, response);
		
		} catch (Exception e) {
			RequestDispatcher rd=request.getRequestDispatcher("Add new employee.html");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}

}
