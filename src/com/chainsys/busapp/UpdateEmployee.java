package com.chainsys.busapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
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
		String username=request.getParameter("name");
		
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String sex=request.getParameter("sex");
		String department=request.getParameter("Department");
		
		UserDao userdao = new UserDao();
		User user=new User();
		
		user.setId(id);
		user.setName(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setSex(sex);
		user.setDepartment(department);
		
		try {
			userdao.update(user);
			System.out.println("UPDATED SUCCESSFULLY!!!!!!!!");
			RequestDispatcher rd=request.getRequestDispatcher("updated.html");
			rd.forward(request, response);
		
		} catch (Exception e) {
			RequestDispatcher rd=request.getRequestDispatcher("Add new employee.html");
			rd.forward(request, response);
			e.printStackTrace();
		}
		
	}

}
