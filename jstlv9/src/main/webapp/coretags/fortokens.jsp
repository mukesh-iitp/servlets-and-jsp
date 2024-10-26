<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>core tags: forTokens</title>
</head>
<body bgcolor=green text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
<u>
<c:out value="Example of core tags"/>
</u>
<c:out value=": forTokens" />
</h1>
<h2>
<c:forTokens var="s" items="Welcome to Advanced Java" delims=" ">
<c:out value="${s }"/><br>
</c:forTokens>
<u><br><c:out value="Now printing with token 'a'"/></u><br><br>
<c:forTokens var="t" items="Welcome to Advanced Java" delims="a">
<c:out value="${t }"/><br>
</c:forTokens>
</h2>
</body>
</html>