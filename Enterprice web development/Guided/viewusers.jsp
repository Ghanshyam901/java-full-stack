<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="emp_servlet.Database,emp_servlet.*, java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<h1>Users List</h1>  
  
<%  
List<User> list=Database.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>EmpId</th><th>Name</th><th>Salary</th><th>LoginId</th>  
<th>Password</th><th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getEmpId()}</td><td>${u.getName()}</td><td>${u.getSalary()}</td>  
<td>${u.getLoginId()}</td><td>${u.getPassword()}</td> 
<td><a href="editform.jsp?id=${u.getEmpId()}">Edit</a></td>  
<td><a href="deleteuser.jsp?id=${u.getEmpId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="adduserform.jsp">Add New User</a> 

</body>
</html>