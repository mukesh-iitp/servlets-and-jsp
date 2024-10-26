<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tag: upper and lower</title>
</head>
<h1><u>Example of toLowerCase & toUpperCase tags</u></h1>
<body bgcolor=red text=yellow>
<h2>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="s" value="Welcome to Advance Java" />
${s}<br>
${fn:toLowerCase(s) }<br>
${fn:toUpperCase(s) }
</h2>
</body>
</html>