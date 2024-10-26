<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tag: trim</title>
</head>
<h1><u>Example of trim tag</u></h1>
<body>
<h2>
<pre>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="s" value="          Welcome  to    Advance     Java          " />
${s}<br>
${fn:trim(s) }
</pre>
</h2>
</body>
</html>