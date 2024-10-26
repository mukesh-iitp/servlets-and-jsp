<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sql tags: query</title>
</head>
<body bgcolor=green text=yellow>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<h1>
<c:out value="Example of SQL Tags"/>
<c:out value=": query" />
</h1>
<h2>
<c:out value="JSTL program to display records from oracle database" /><br><br>
<sql:setDataSource var="con" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:orcl" user="c##guest" password="guest"/>
<sql:query var="rs" dataSource="${con }" sql="select * from student" />
<table border=2 width=200 heigh=30>
<c:forEach var="record" items="${rs.rows }">
<tr><td><c:out value="${record.rollno }"/></td>
<td><c:out value="${record.name }"/></td>
<td><c:out value="${record.marks }"/></td></tr>
</c:forEach>
</table>
</h2>
</body>
</html>