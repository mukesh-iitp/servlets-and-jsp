package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BatchUpdateDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Drier Loaded.");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
		System.out.println("Databse connected.");
		Statement stmt=con.createStatement();
		stmt.addBatch("INSERT INTO employee Values(1026,'Rakesh','Rathor','AGM','Management',36500)");
		stmt.addBatch("INSERT INTO employee Values(1027, 'Ritesh','Ranjan','Manager','Sales',20100)");
		stmt.addBatch("UPDATE employee SET sal=10500 WHERE empno=1022");
		stmt.addBatch("DELETE FROM employee WHERE empno=1018");
		stmt.executeBatch();
		
		System.out.println("Batch executed successfully");
		
	}	
}
	
