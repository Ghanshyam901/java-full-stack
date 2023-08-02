<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="emp_servlet.Database,emp_servlet.User"%>  
  
<%  
String id=request.getParameter("id");
User u=Database.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="edituser.jsp" method="post">  
<input type="hidden" name="empId" value="<%=u.getEmpId() %>"/>  
<table>  
<tr><td>Name:</td><td>  
<input type="text" name="name" value="<%= u.getName()%>"/></td></tr>  
<tr><td>Salary:</td><td>  
<input type="number" name="salary" value="<%= u.getSalary()%>"/></td></tr>  
<tr><td>LoginId:</td><td>  
<input type="text" name="loginId" value="<%= u.getLoginId()%>"/></td></tr>  
<tr><td>Password:</td><td>  
<input type="password" name="password" value="<%= u.getPassword()%>"/>
</td></tr>  
<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
</table>  
</form>

</body>
</html>