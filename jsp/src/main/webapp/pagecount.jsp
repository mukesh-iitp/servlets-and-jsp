<%-- JSP Program to demonstrate declaration and expression --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page counter</title>
</head>
<body bgcolor=yellow text=blue>
<h1>
<jsp:declaration>
int count=0;
</jsp:declaration>
This page has been accessed
<jsp:expression>
++count
</jsp:expression>
times.
</h1>
</body>
</html>