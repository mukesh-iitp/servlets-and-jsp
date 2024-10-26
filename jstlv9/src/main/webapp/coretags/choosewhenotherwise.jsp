<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>core tags: choose,when and otherwise</title>
</head>
<body bgcolor=green text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
<u>
<c:out value="Example of core tags"/>
</u>
<c:out value=": choose,when and otherwise" />
</h1>
<h2>
<c:set var="a" value="0" />
<c:choose>
<c:when test="${a>0 }">
<c:out value="Positive Number"/>
</c:when>
<c:when test="${a<0 }">
<c:out value="Negative Number"/>
</c:when>
<c:otherwise>
<c:out value="Zero"/>
</c:otherwise>
</c:choose>
</h2>
</body>
</html>