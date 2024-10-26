<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication result</title>
</head>
<body bgcolor=lightgreen text=black>
<jsp:include page="header.jsp" />
<h2>
<center>
<%
String s1=request.getParameter("first");
String s2=request.getParameter("second");
int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);
out.println("Output: "+(x*y));
%>
</h2>
</center>
<jsp:include page="footer.jsp" />
</body>
</html>