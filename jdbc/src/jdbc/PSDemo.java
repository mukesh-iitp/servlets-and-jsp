
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PSDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded...");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
		System.out.println("Connection established...");
		PreparedStatement pstmt=con.prepareStatement("INSERT INTO employee Values(?,?,?,?,?,?)");
		pstmt.setInt(1, Integer.parseInt(args[0]));
		pstmt.setString(2, args[1]);
		pstmt.setString(3, args[2]);
		pstmt.setString(4, args[3]);
		pstmt.setString(5, args[4]);
		pstmt.setFloat(6, Float.parseFloat(args[5]));
		pstmt.executeUpdate();
		System.out.println("One record inserted successfully");	
		
	
	}

}
