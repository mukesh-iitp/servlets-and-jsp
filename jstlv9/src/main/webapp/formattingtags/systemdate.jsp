<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>System Date</title>
</head>
<body bgcolor=lightgrey text=yellow>
<h1>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="c" %>
<c:set ver="d" value="<%= new java.util.Date() %>"/>
<c:out value="${d }"/>
</h1>
</body>
</html>