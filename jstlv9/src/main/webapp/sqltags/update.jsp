<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sql tags: update</title>
</head>
<body bgcolor=green text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<h1>
<c:out value="Example of SQL Tags"/>
<c:out value=": update" />
</h1>
<h2>
<c:out value="JSTL program to insert a record into an Oracle database" /><br><br>
<sql:setDataSource var="con" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:orcl" user="c##guest" password="guest"/>
<sql:update dataSource="${con }" sql="insert into student values(5,'Ramanuj',93)" />
<c:out value="One record inserted successfully."/>
</h2>
</body>
</html>