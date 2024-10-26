<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor=yellow text=blue>
<h1>
<% String s1=request.getParameter("uname");
	String s2=request.getParameter("pword");
	if(s1.equals("abc")&&s2.equals("xyz"))
		out.println("Welcome.........");
	else
		out.println("Invalid username/password");
%>
</h1>
</body>
</html>