//Establishing connection with Oracle Database using TYPE4 Driver.
package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TypeFourConnectionDemo 
{
	public static void main(String[] args) 
	{
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver Loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
				System.out.println("Connection established successfully using TYPE4 driver.\n"+con);
			}
			catch (Exception e)
			{	
				System.err.println(e);
			}
	}

}
