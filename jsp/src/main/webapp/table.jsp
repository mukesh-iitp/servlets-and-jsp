<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=green text=yellow>
<table border=10>
<% for(int i=1; i<=100;i++) { %>
	<tr>
	<td>5</td>
	<td>X</td>
	<td><%= i %></td>
	<td>=</td>
	<td><%= 5*i %></td>
	</tr>
<% } %>
</table>
</body>
</html>