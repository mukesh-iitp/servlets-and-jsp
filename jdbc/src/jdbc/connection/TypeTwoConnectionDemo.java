//Establishing connection with Oracle Database using TYPE2 Driver.

package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TypeTwoConnectionDemo 
{
	public static void main(String[] args) //throws ClassNotFoundException 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@ORCL","c##guest","guest");
			System.out.println("Connection established successfully using TYPE2 driver.\n"+con);
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
}
