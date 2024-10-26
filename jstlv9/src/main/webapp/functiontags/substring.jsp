<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tag: substring</title>
</head>
<h1><u>Example of substring(), substringAfter() and substringBefore() tags</u></h1>
<body bgcolor=red text=yellow>
<h2>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="s" value="Welcome to Advanced Java" />
${s}<br>
${fn:substring(s,11,24) }<br>
${fn:substringAfter(s,'Welcome') }<br>
${fn:substringBefore(s,'Java') }
</h2>
</body>
</html>