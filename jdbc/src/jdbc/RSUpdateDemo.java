//Program to update record using ResultSet Enhancement feature.
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class RSUpdateDemo 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded.");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
		System.out.println("Connected to database.");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("Select empno, fname, lname, job, dept, sal From employee");
		System.out.print("Enter absolute value: ");
		rs.absolute(sc.nextInt());
		System.out.println("\nEmployee Details:");
		System.out.println("--------------------------");
		System.out.println("Empno:"+rs.getInt(1)+", Name:"+rs.getString(2)+" "+rs.getString(3)+"\nJob:"+rs.getString(4)+" Dept:"+rs.getString(5)+" Salary:"+rs.getFloat(6));
		System.out.println("\nInitializing salary update command");
		System.out.print("Enter new salary: ");
		rs.updateFloat(6,sc.nextFloat());
		sc.close();
		rs.updateRow();
		System.out.println("Salay updated.");
		
		
	}

}
