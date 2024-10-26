<%-- JSP Program to demonstrate declaration and expression --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Databse Connection</title>
</head>
<body bgcolor=yellow text=blue>
<h1><u>JSP Connection with databse example</u></h1>
<br><h2><font color=red>Stundent Database</font></h2>
<table border=2>
<%@ page import="java.sql.*" %>
<%!
Connection con;
public void jspInit()
{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##guest","guest");
	System.out.println("Connected with database.");
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
}
%>
<%
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student");
while(rs.next())
{
	out.println("<tr><td>"+rs.getInt("rollno")+"</td>");
	out.println("<td>"+rs.getString("name")+"</td>");
	out.println("<td>"+rs.getInt("marks")+"</td></tr>");
}
%>
<%!
public void jspDestroy()
{
	try{
		con.close();
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
}
%>
</table>
</body>
</html>