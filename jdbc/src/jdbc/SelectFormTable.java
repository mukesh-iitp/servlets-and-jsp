//Program to retrieve data from database

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class SelectFormTable 
{
	public static void main(String[] args) 
	{
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver Loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
				System.out.println("Connection established successfully.");

				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT * FROM employee");
				ResultSetMetaData rm=rs.getMetaData();
				int n=rm.getColumnCount();
				
				for(int i=1;i<=n;i++)
				{
					System.out.print(rm.getColumnName(i)+"\t");
				}
				System.out.println();
				System.out.println("-------------------------------------------------------------");
				
				while(rs.next())
				{
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.println(rs.getFloat(6)+"\t");
				}
				
			}
			catch (Exception e)
			{	
				System.err.println(e);
			}
	}

}
