<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>System Time</title>
</head>
<body bgcolor=green text=yellow>
<h1>
Using Declaration:
<%! java.util.Date d=new java.util.Date(); %>
<% out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()); %>
<br>Using Sriptlets:
<% java.util.Date d=new java.util.Date(); %>
<% out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()); %>
<br>Using Expressions:
<%= d.getHours() %>:<%= d.getMinutes() %>:<%= d.getSeconds() %>
</h1>
</body>
</html>