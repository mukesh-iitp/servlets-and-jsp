<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sql tags: setDataSource</title>
</head>
<body bgcolor=green text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<h1>
<c:out value="Example of SQL Tags"/>
<c:out value=": setDataSource" />
</h1>
<h2>
<c:out value="JSTL program to establish a connection between JSP & Oracle database" /><br><br>
<sql:setDataSource var="con" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:orcl" user="c##guest" password="guest"/>
<c:out value="Connection established successfully."/>
</h2>
</body>
</html>