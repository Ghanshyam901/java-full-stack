<%@ page import="java.util.*" %>
<%@ page import="com_Employee.Employee" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body bgcolor=lightyellow text=blue>
		<b>Welcome hR!</b>
		<center>
		<h1>Welcome to Employee Home Page </h1>
		<a href="#">GetEmployeeById &nbsp;</a>
		<a href="#">Get all Employee</a>
		
		<form action="EmployeeServlet" method="post">
	    <table>

	       <tr><td align="right">EmpId</td><td><input type="number" name="id"></td></tr>

	      <tr><td align="right">Name</td><td><input type="text" name="name"></td></tr>

	  <tr><td align="right">Salary</td><td><input type="number" name="salary"></td></tr>

	  <tr><td align="right">Gender</td><td><input type="text" name="gender"></td></tr>

	   <tr><td align="right">LoginId</td><td><input type="text" name="loginid"></td></tr>
	    <tr><td align="right">Password</td><td><input type="text" name="pwd"></td></tr>

	     <tr><td align="right"></td><td><input type="submit" value="EditEmployee"></td></tr>
	</table>
	</form></center>

</body>
</html>