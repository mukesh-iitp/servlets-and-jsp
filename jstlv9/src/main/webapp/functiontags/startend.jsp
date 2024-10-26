<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tag: startsWith and endsWith</title>
</head>
<h1><u>Example of startWith & endWidth tags</u></h1>
<body bgcolor=red text=yellow>
<h2>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="s" value="Welcome" />
${fn:startsWith(s,"W") }<br>
${fn:endsWith(s,"came") }<br>
<c:set var="s2" value="demo.java"/>
<c:if test="${fn:endsWith(s2,'java') }">
<c:out value="Yes, the given file is Java File"/>
</c:if>
</h2>
</body>
</html>