<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Page</title>
</head>
<body bgcolor=yellow text=green>
<jsp:include page="header.jsp" />
<h2><u>JSP:</u></h2>
<% out.println("JSP stands for Java Server Pages.JSP is a specification for developing web applications with Java programing language. Servlet & JSP having same definition. First servlet came later JSP came.");%>
<jsp:include page="footer.jsp" />
</body>
</html>