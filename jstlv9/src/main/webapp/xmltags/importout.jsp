<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XML tags: parse, out</title>
</head>
<body bgcolor=red text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<c:import var="e" url="emp.xml"/>
<h2>
<x:parse xml="${e}" var="p"/>
<x:out select="$p/emp/emp-no"/>
<x:out select="$p/emp/name"/>
<x:out select="$p/emp/salary"/>
</h2>
</body>
</html>