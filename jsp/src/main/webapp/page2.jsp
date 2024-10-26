<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second Page</title>
</head>
<body bgcolor=yellow text=green>
<jsp:include page="header.jsp" />
<h1><u>JSTL:</u></h1>
<% out.println("JSTL stands for Java server pages Standard Tag Library. It is introduced in JSP 2.0 version to simplify the JSP."); %>
<jsp:include page="footer.jsp" />
</body>
</html>