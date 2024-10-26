package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) 
	{
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver Loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
				System.out.println("Connection established successfully.");
				//creating a statement
				Statement stmt=con.createStatement();
				//executing  DML query
				stmt.executeUpdate("CREATE TABLE employee(empno Number(4) Constraint empno_pk Primary Key, fname Varchar2(10), lname Varchar2(10), job Varchar2(10),dept Varchar2(10), sal Number(8,2))");
				System.out.println("Table created sucessfully.");
			}
			catch (Exception e)
			{	
				System.err.println(e);
			}
	}

	

}
