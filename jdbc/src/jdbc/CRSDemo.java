//Program to demonstrate Cached RowSet

package jdbc;

import javax.sql.rowset.CachedRowSet;
import oracle.jdbc.rowset.OracleCachedRowSet;

public class CRSDemo 
{
	public static void main(String[] args) throws Exception
	{
		CachedRowSet crs=new OracleCachedRowSet();
		crs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		crs.setUsername("c##guest");
		crs.setPassword("guest");
		crs.setCommand("select * from employee");
		crs.execute();
		
		while(crs.next())
		{
			System.out.print(crs.getInt("empno")+"\t");
			System.out.print(crs.getString("fname")+"\t");
			System.out.print(crs.getString("lname")+"\t");
			System.out.print(crs.getString("job")+"\t");
			System.out.print(crs.getString("dept")+"\t");
			System.out.println(crs.getFloat("sal")+"\t");
		}
		
	}

}
