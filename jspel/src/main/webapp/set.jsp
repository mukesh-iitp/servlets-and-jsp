<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Cookie</title>
</head>
<body>
<%
Cookie c=new Cookie("message", "Welcome");
response.addCookie(c); 
%>
</body>
</html>