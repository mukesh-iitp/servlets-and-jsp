//Program to demonstrate Oracle JDBC RowSet

package jdbc;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class JRSDemo 
{
	public static void main(String[] args) throws Exception
	{
		JdbcRowSet jrs=new OracleJDBCRowSet();
		jrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		jrs.setUsername("c##guest");
		jrs.setPassword("guest");
		jrs.setCommand("select * from employee");
		jrs.execute();
		
		while(jrs.next())
		{
			System.out.print(jrs.getInt("empno")+"\t");
			System.out.print(jrs.getString("fname")+"\t");
			System.out.print(jrs.getString("lname")+"\t");
			System.out.print(jrs.getString("job")+"\t");
			System.out.print(jrs.getString("dept")+"\t");
			System.out.println(jrs.getFloat("sal")+"\t");
		}
		
	}

}
