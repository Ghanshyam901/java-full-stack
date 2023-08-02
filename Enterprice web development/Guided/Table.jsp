<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="emp_servlet.User" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>

<table border ="1" width="500" align="center">
	 <tr bgcolor="00FF7F">
	  <th><b>EmpID</b></th>
	  <th><b>LoginID</b></th>
	  <th><b>Password</b></th>
	  <th><b>Name</b></th>
	  <th><b>Salary</b></th>
	 </tr>
	
	<%ArrayList<User> std = (ArrayList<User>)request.getAttribute("data");
	for(User s:std){%>
	    <tr>
	        <td><%=s.getEmpId() %></td>
	        <td><%=s.getLoginId() %></td>
	        <td><%=s.getPassword() %></td>
	        <td><%=s.getName() %></td>
	        <td><%=s.getSalary() %></td>
	    </tr>
	    <%}%>
</table> 

<p>
	<table>
		<tr>
			<td><a href="adduserform.jsp">Add User</a></td>
		</tr>
		<tr>			
			<td><a href="viewusers.jsp">View Users</a></td>
		</tr>
	</table>
</p>


</body>
</html>