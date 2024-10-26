<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=yellow text=red>
<h1>
<% out.println("Include Directive Example"); %>
<%@ include file="demo.jsp" %>
<%@ include file="test.jsp" %>
<%@ include file="table.jsp" %>
<%@ include file="login.html" %>
</h1>
</body>
</html>