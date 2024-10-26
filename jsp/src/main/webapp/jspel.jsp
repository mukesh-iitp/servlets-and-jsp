<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSPEL Demo</title>
</head>
<body bgcolor=red text=yellow>
<h1>
<%
pageContext.setAttribute("book1","Java2 Complete Reference", PageContext.PAGE_SCOPE);
pageContext.setAttribute("book2","Head First Java", PageContext.REQUEST_SCOPE);
pageContext.setAttribute("book3","Java Black Book", PageContext.SESSION_SCOPE);
pageContext.setAttribute("book4","SCJP By Kathy Sierra", PageContext.APPLICATION_SCOPE);
%>
${pageScope.book1}<br>
${requestScope.book2}<br>
${sessionScope.book3}<br>
${applicationScope.book4}
</h1>
</body>
</html>