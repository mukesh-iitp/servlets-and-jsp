<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bean JSP</title>
</head>
<body>
<h1>
<jsp:useBean id="mb" class="bean.MessageBean" />
<jsp:setProperty name="mb" property="message" value="Welcome" />
<jsp:getProperty name="mb" property="message" />
</h1>
</body>
</html>