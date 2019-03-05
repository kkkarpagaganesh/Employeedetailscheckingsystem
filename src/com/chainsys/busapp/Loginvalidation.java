package com.chainsys.busapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Loginvalidation {
	public boolean loginValidator(String email, String password)
			throws SQLException {
		boolean isValid = false;

		Connection connection = Connectionutil.getconnection();
		String sql3 = "select email,password from signup where email=?";

		PreparedStatement preparedstatement = connection.prepareStatement(sql3);
		preparedstatement.setString(1, email);
		System.out.println(email);

		ResultSet rset = preparedstatement.executeQuery();

		if (rset.next()) {
			//System.out.println(rset.getString("email"));
			//System.out.println(password);
			//System.out.println(rset.getString(email));
			if (rset.getString("email").contentEquals(email)
					&& rset.getString("password").contentEquals(password)) {
				 isValid = true;
			}
		}
		Connectionutil.close(connection, preparedstatement, null);
		return isValid;
	}
	
	public boolean signupValidator(int id,int code)
			throws SQLException {
		boolean isValid = false;

		Connection connection = Connectionutil.getconnection();
		String sql3 = "select * from code where adminid="+id;

		PreparedStatement preparedstatement = connection.prepareStatement(sql3);
	//	preparedstatement.setInt(1,id);
	//	System.out.println(email);

		ResultSet rset = preparedstatement.executeQuery();
		System.out.print("id="+id);
		System.out.print("code="+code);
	
		


		
			int cd = 0;
			int aid = 0;
			//System.out.println(rset.getString("email"));
			//System.out.println(password);
			//System.out.println(rset.getString(email));
			while(rset.next()){
			 aid=rset.getInt(1);
			System.out.println("aid="+aid);
			  cd=rset.getInt(2);
			 System.out.println("cd="+cd);
			}
		
	//	int aid=rset.getInt("adminid");
		
		//int cd=rset.getInt("code");
		
		
		if (aid ==id && cd==code) {
			 isValid = true;
		}
		
		Connectionutil.close(connection, preparedstatement, null);
		return isValid;
	}


}
