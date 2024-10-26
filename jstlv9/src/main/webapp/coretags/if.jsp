<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>core tags: if</title>
</head>
<body bgcolor=green text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
<u>
<c:out value="Example of core tags"/>
</u>
<c:out value=": if" />
</h1>
<h2>
<c:set var="a" value="10" />
<c:if test="${a>0 }">
<c:out value="Positive Number"/>
</c:if>
</h2>
</body>
</html>