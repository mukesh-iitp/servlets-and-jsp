//Program to demonstrate WebRowSet

package jdbc;

import java.io.FileOutputStream;
import javax.sql.rowset.WebRowSet;
import oracle.jdbc.rowset.OracleWebRowSet;

public class WRSDemo 
{
	public static void main(String[] args) throws Exception
	{
		WebRowSet wrs=new OracleWebRowSet();
		wrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		wrs.setUsername("c##guest");
		wrs.setPassword("guest");
		wrs.setCommand("select * from employee");
		wrs.execute();
		
		wrs.writeXml(new FileOutputStream("C:\\Users\\Mukesh\\eclipse-workspace\\jdbc\\Files\\employee.xml"));
		System.out.println("WebRowSet data written to student xmlfile");
	}
}
