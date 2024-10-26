<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tag: escapeXml</title>
</head>
<h1><u>Example of escapeXml()</u></h1>
<body bgcolor=red text=yellow>
<h2>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="s" value="<message>Welcome to JSP</message>" />
${s}<br>
${fn:escapeXml(s) }		//xml tags are escaped and as it is printed
</h2>
</body>
</html>