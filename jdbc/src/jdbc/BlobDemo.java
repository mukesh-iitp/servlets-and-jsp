//Program to insert image into images(name,image) database
//Using BLOB

package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded.");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
		System.out.println("Database connection established successfully.");
		//Dynamically storing the values
		PreparedStatement pstmt=con.prepareStatement("insert into images values(?,?)");
		pstmt.setString(1, args[0]);
		FileInputStream fis=new FileInputStream(args[1]);
		int n=fis.available();
		pstmt.setBinaryStream(2,fis,n);
		//pstmt.setBinaryStream(2,new fileInputStream(args[1]), new fileInputStream(args[1]).available() );
		pstmt.executeUpdate();
		System.out.println("One image inserted successfully");
		
	}

}
