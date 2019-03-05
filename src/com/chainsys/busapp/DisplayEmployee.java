package com.chainsys.busapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayEmployee
 */
@WebServlet("/DisplayEmployee")
public class DisplayEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEmployee() {
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
		UserDao userdao = new UserDao();
		List<User> user = new ArrayList<User>();
			try {
				 user=userdao.getAllRecords();
				System.out.println("DISPLAY SUCCESSFULLY!!!!!!!!");
				request.setAttribute("LIST",user);
				RequestDispatcher rd=request.getRequestDispatcher("EntireEmployeeList.jsp");
				rd.forward(request, response);
			
			} catch (Exception e) {
				RequestDispatcher rd=request.getRequestDispatcher("selectlist.jsp");
				rd.forward(request, response);
				e.printStackTrace();
			}
	}

}
