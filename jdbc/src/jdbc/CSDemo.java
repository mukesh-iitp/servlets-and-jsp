//Program to demonstrate CallableStatement

/*
 Oracle command used:  
 create or replace procedure insertpro(p employee.empno%type,q employee.fname%type,r employee.lname%type,s employee.job%type,t employee.dept%type,u employee.sal%type) as
 Begin
 Insert into employee Values(p,q,r,s,t,u);
 End;
 /
 */
package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CSDemo 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
		
		CallableStatement cstmt=con.prepareCall("{call insertpro(?,?,?,?,?,?)}");
		
		/*
		//For providing argument at time of running program
		cstmt.setInt(1, Integer.parseInt(args[0]));
		cstmt.setString(2, args[1]);
		cstmt.setString(3, args[2]);
		cstmt.setString(4, args[3]);
		cstmt.setString(5, args[4]);
		cstmt.setFloat(6, Float.parseFloat(args[5]));
		*/
		
		System.out.println("Enter below details: ");
		System.out.print("Employee No: ");
		cstmt.setInt(1, sc.nextInt());
		System.out.print("First Name: ");
		cstmt.setString(2, sc.next());
		System.out.print("Last Name: ");
		cstmt.setString(3, sc.next());
		System.out.print("Job Role: ");
		cstmt.setString(4, sc.next());
		System.out.print("Department: ");
		cstmt.setString(5, sc.next());
		System.out.print("Salary: ");
		cstmt.setFloat(6, sc.nextFloat());
		cstmt.executeUpdate();
		
		System.out.println("One record inserted successfully.");	
	}

}
