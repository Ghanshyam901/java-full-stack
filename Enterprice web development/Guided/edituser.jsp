<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="emp_servlet.Database"%>  
<jsp:useBean id="u" class="emp_servlet.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=Database.update(u); 
response.sendRedirect("viewusers.jsp");  
%>  

</body>
</html>