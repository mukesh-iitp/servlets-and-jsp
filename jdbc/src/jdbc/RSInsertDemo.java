//Program to insert record using ResultSet Enhancement feature.
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class RSInsertDemo 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("Select empno, fname, lname, job, dept, sal From employee");
		rs.moveToInsertRow();
		System.out.println("Enter below details: ");
		System.out.print("Employee No: ");
		rs.updateInt(1, sc.nextInt());
		System.out.print("First Name: ");
		rs.updateString(2, sc.next());
		System.out.print("Last Name: ");
		rs.updateString(3, sc.next());
		System.out.print("Job Role: ");
		rs.updateString(4, sc.next());
		System.out.print("Department: ");
		rs.updateString(5, sc.next());
		System.out.print("Salary: ");
		rs.updateFloat(6, sc.nextFloat());
		rs.insertRow();
		System.out.println("One record inserted successfully.");
	}

}
