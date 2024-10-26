<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>core tags: forEach</title>
</head>
<body bgcolor=green text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
<u>
<c:out value="Example of core tags"/>
</u>
<c:out value=": forEach" />
</h1>
<h2>
<c:forEach var="i" begin="1" end="100" step="1">
<c:out value="${i }"/><br>
</c:forEach>
</h2>
</body>
</html>