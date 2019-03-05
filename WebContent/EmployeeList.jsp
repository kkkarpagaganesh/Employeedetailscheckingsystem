<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
<style>
body{
         background-image: url('registration7.jpg');
         background-repeat: no-repeat;
         background-size:cover;
         }
table{
border-collapse:collapse;
table-layout:auto;
width:80%;
}
th,td{
padding:5px;
}
</style>
<link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body align="center" marginheight="160px">
<form action="LogoutController" method="post">
	<h3>List of EmployeeDetails</h3>
	<table align="center" border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>email</th>
				<th>password</th>
				<th>sex</th>
				<th>department</th>
			</tr>
		</thead>
		<tbody>
			<tr>
					<td>${list.id}</td>
					<td>${list.name}</td>
					<td>${list.email}</td>
					<td>${list.password}</td>
					<td>${list.sex}</td>
					<td>${list.department}</td>
				</tr>
			
		</tbody>
	</table>
<a href="selectlist.jsp" style="font-size: 40px">Home</a>
<br><br>
<button type="submit" style="height:50px;width: 90px;background-color: #0DF329   ">Sign out</button>
</form>
</body>
</html>