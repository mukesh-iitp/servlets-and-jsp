<%-- JSP Program to demonstrate scriptlet --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scriptlets</title>
</head>
<body bgcolor=yellow text=blue>
<h1>
<jsp:scriptlet>
out.println("Welcome to JSP! Its awesome and easy.");
</jsp:scriptlet>
</h1>
</body>
</html>