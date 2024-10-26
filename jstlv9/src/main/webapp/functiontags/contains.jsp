<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tag: contains</title>
</head>
<h1><u>Example of contains & containsIgnoreCase tags</u></h1>
<body bgcolor=red text=yellow>
<h2>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="s" value="Welcome to JSTL" />
<c:if test="${fn:contains(s,'JSTL') }">
<c:out value="Yes, Given sting contains JSTL"/><br>
</c:if>
${fn:contains(s,'jstl')}<br>
${fn:containsIgnoreCase(s,'JSTL')}<br>
${fn:containsIgnoreCase(s,'jstl')}
</h2>
</body>
</html>