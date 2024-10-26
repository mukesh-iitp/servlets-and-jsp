<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>core tags: set and remove</title>
</head>
<body bgcolor=green text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
<u>
<c:out value="Example of core tags"/>
</u>
<c:out value=": set and remove" />
</h1>
<h2>
<c:set var="a" value="10" />
<c:out value="a" /><br>
<c:out value="${a}" /><br>
<c:remove var="a" />
<c:out value="${a}" /><br>
<c:set var="b" value="5.2f"/>
<c:set var="c" value="2.2f"/>
<c:out value="${b+c }"/>
</h2>
</body>
</html>