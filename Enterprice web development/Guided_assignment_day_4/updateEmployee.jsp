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
		<%
List<Employee> emplist=(List<Employee>)request.getAttribute("allteams");
%>
<form action="EmployeeServlet" method="post">
<center>
<div class="container">
	<table >
			<thead >
				<tr>
					<th>EmpId</th>
					<th>Name</th>
					<th>Salary</th>
					<th>Gender</th>
					<th>LoginId</th>
					<th>Action</th>
					
				</tr>
			</thead>
			<tbody class="bg-info">
			<% for(Employee t:emplist)
			{
				out.write("<tr>");
				out.write("<td>"+t.getEmpId()+"</td>");
				out.write("<td>"+t.getName() +"</td>");
				out.write("<td>"+t.getSalary()+"</td>");
				out.write("<td>"+t.getGender() +"</td>");
				out.write("<td>"+t.getLoginId() +"</td>");
				out.write("<td>");
				out.write("<input type='submit' value='edit' name='request_type' class='btn btn-primary'>");
				out.write("<input type='submit' value='delete' name='request_type' class='btn btn-primary'>");
				out.write("<td>");
				out.write("</tr>");
			}
			%>
			</tbody>
	</table>
		
		</center>


</body>
</html>