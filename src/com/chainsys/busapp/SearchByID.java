package com.chainsys.busapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchByID
 */
@WebServlet("/SearchByID")
public class SearchByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchByID() {
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
		
int id=Integer.parseInt(request.getParameter("Id"));
		
		UserDao userdao = new UserDao();
		User user=new User();
		
		user.setId(id);
		
		User user1=new User();
			try {
				 user1=userdao.getRecordById(user);
				System.out.println("SEARCH SUCCESSFULLY!!!!!!!!");
				request.setAttribute("list",user1);
				RequestDispatcher rd=request.getRequestDispatcher("EmployeeList.jsp");
				rd.forward(request, response);
			
			} catch (Exception e) {
				RequestDispatcher rd=request.getRequestDispatcher("selectlist.html");
				rd.forward(request, response);
				e.printStackTrace();
			}
	}

}
