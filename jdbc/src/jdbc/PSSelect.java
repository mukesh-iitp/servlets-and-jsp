//Program to demonstrate Prepared Statement & Retrieve marks of Name and salary of given empno from employee database

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PSSelect 
{
	public static void main(String[] args)
	{
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
			PreparedStatement pstmt=con.prepareStatement("Select fname,lname,sal From employee Where empno=?");
			System.out.print("Provide employee no:");
			pstmt.setInt(1,sc.nextInt());
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			System.out.println();
			System.out.println("Emp name: "+rs.getString(1)+" "+rs.getString(2)+"\nSalary: "+rs.getInt("sal"));
			}
		catch (ClassNotFoundException | SQLException e)
			{
			//System.err.println(e);	//or
			e.printStackTrace();
			}

	}

}
