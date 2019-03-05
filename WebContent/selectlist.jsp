<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SELECT LIST</title>
<style>
body{
         background-image: url('arizona-asphalt.jpg');
         background-repeat: no-repeat;
         background-size:cover;
         }

input[type=], input[type=password] {
  width: 100%;
  padding: 9px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #0DF329    ;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

</style>
<%
	response.setHeader("Cache-control", "no-cache");
	response.setHeader("Cache-control", "no-store");
	response.setHeader("pragma", "no-cache");
	//response.setHeader("cache-control",")
	response.setDateHeader("Expires",0);
%>
</head>
			<%
			String u = (String) request.getSession().getAttribute("email");
			if (u != null) {
				out.print("welcome  " + u);
		
			} 
		/*	else {
				response.sendRedirect("expire.jsp");
			}*/
		%>
	<body align="right" marginheight="30px" marginwidth="20px">
	<form action="LogoutController" method="post">

		<button type="submit" style="height:50px;width: 90px; ">Sign out</button>
	
	
	<h1 align="center"  style="color: skyblue"></h1>
		<table align="center" style="padding: 20px">
			<tbody>
				
				<tr>
					<td><button type="button" onclick="window.location.href='Add new employee.html'" style="height:50px; width:300px;" >NEW EMPLOYEE</button><br><br></td>
				</tr>
				
				<tr>
					<td><button type="button" onclick="window.location.href='Update employee.html'" style="height:50px; width:300px;">UPDATE EMPLOYEE</button><br><br></td>
				</tr>
				
				<tr>
					<td><button type="button" onclick="window.location.href='Delete employee.html'" style="height:50px; width:300px;">REMOVE EMPLOYEE</button><br><br></td>
				</tr>
				
				<tr>
					<td><button type="button" onclick="window.location.href='search.html'" style="height:50px; width:300px;">SEARCH</button><br><br></td>
				</tr>
				<tr>
					<td><button type="button" onclick="window.location.href='Display.html'" style="height:50px; width:300px;">EMPLOYEE LIST</button><br><br></td>
				</tr>
				
			</tbody>
		</table>
	

	
	
	<% /*	<br> <a href="Add new employee.html">Add
			new employee</a> <br> <a href="Update employee.html">Update
			employee</a> <br> <a href="Delete employee.html">Delete employee</a>
		<br> <a href="SearchbyID.html">Search by ID </a> <br> <a
			href="Display.html">Display</a> <br>
		<button type="submit" align="right" marginheight="20px">Sign
			out</button> */  %>
		
			
		
	</form>

</body>
</html>