<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tag: split,join,length,index</title>
</head>
<h1><u>Example of split(), join(), lenght(), index() tags</u></h1>
<body bgcolor=red text=yellow>
<h2>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="s1" value="Welcome to Advanced Java" />
<c:set var="s2" value="${fn:split(s1,' ')}"/>
<c:set var="s3" value="${fn:join(s2,'-') }"/>
${s1 }<br>
${s2 }<br>
${s3 }<br>
${fn:length(s3) }<br>
${fn:indexOf(s3,'Advanced') }
</h2>
</body>
</html>