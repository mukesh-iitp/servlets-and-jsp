//Program to insert image into images(name,image) database
//Using ClobDemo

package jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClobDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
		System.out.println("Database connection established successfully.");
		PreparedStatement pstmt=con.prepareStatement("insert into files values(?,?)");
		pstmt.setString(1, args[0]);

		FileReader fr=new FileReader(args[1]);
		//int n=fr.available();
		pstmt.setCharacterStream(2,fr);
				
		//pstmt.setBinaryStream(2,new fileInputStream(args[1]), new fileInputStream(args[1]).available() );
		
		pstmt.executeUpdate();
		System.out.println("One file inserted successfully");
		
	}

}
