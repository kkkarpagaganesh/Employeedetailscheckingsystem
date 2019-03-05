<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EntireEmployeeList</title>
<link rel="stylesheet" type="text/css" href="style1.css">
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

</head>
<body align="center" marginheight="160px">
<form action="LogoutController" method="post">
	<h1>Full Employee List</h1>
	<table align="center" border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>email</th>
				<th>password</th>
				<th>sex</th>
				<th>department</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${LIST}">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td>${user.password}</td>
					<td>${user.sex}</td>
					<td>${user.department}</td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
<a href="selectlist.jsp" style="font-size: 40px">Home</a>
<br>
<br>
<button type="submit" style="height:50px;width: 90px;background-color: #0DF329 ">Sign out</button>
</form>
</body>
</html>