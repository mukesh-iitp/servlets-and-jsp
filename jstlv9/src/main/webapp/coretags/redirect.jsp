<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>core tags: redirect</title>
</head>
<body bgcolor=green text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
<u>
<c:out value="Example of core tags"/>
</u>
<c:out value=": redirect" />
</h1>
<h2>
<c:redirect url="out.jsp"/>
</h2>
</body>
</html>