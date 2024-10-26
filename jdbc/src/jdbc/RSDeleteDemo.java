package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class RSDeleteDemo 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Initiating the ResultSet delect program.");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("\nDriver loaded.");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
		System.out.println("Connected to the employee database");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("Select empno, fname, lname, job, dept, sal From employee");
		System.out.print("Enter absolute value: ");
		rs.absolute(sc.nextInt());
		System.out.println("\nEmployee Details:");
		System.out.println("--------------------------");
		System.out.println("Empno:"+rs.getInt(1)+", Name:"+rs.getString(2)+" "+rs.getString(3)+"\nJob:"+rs.getString(4)+" Dept:"+rs.getString(5)+" Salary:"+rs.getFloat(6));
		System.out.println("\nInitializing delete row command");
		//rs.deleteRow();
		//System.out.println("One record deleted successfully.");
		
		///*
		System.out.print("Do you want to delete this employee records(Yes/No): ");
		String s=sc.next();
		
		if(s.equals("Yes"))
		{
			rs.deleteRow();
			System.out.println("One record deleted successfully.");
		}
		else if(s.equals("No"))
		{
			System.out.println("Delete command successful.\nDatabase remains un-altered!");
		}
		else
		{
			System.out.println("You have entered incorrect input.");
			System.out.println("Delete command unsuccessful!");
		}
		//*/
	}

}
