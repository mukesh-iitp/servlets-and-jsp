<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body bgcolor=green text=yellow>
<h1>
<% mvc.Result r=(mvc.Result)request.getAttribute("result"); %>
<table>
<tr><td>H.No: </td><td> <%=r.getHno() %></td></tr>
<tr><td>Name: </td><td><%=r.getName() %></td>></tr>
<tr><td>C: </td><td><%=r.getC() %></td></tr>
<tr><td>C++: </td><td><%=r.getCpp() %></td></tr>
<tr><td>Java: </td><td><%=r.getJava() %></td></tr>
</table>
</h1>
</body>
</html>