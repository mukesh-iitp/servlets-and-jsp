//Program to move the cursor using ResultSet Enhancement feature.

package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class RSMoveDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded.");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
		System.out.println("Connected to database.");
		
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("Select * from employee");
		//rs.absolute(5);
		rs.absolute(-4);
		System.out.println("\nEmployee Details:");
		System.out.println("--------------------------");
		System.out.println("Empno:"+rs.getInt(1)+", Name:"+rs.getString(2)+" "+rs.getString(3)+"\nJob:"+rs.getString(4)+" Dept:"+rs.getString(5)+" Salary:"+rs.getFloat(6));
		
		
	}

}
