package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord 
{
	public static void main(String[] args) 
	{
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver Loaded");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
				System.out.println("Connection established successfully.");
				//creating a statement
				Statement stmt=con.createStatement();
				//executing  DML query
				stmt.executeUpdate("INSERT INTO employee Values(1001,'Ravish','Pathani','VP','Management',35000)");
				stmt.executeUpdate("INSERT INTO employee Values(1002,'Swati','Tarpade','President','Management',33000)");
				stmt.executeUpdate("INSERT INTO employee Values(1003,'Mira','Kalra','AVP','Management',34000)");
				stmt.executeUpdate("INSERT INTO employee Values(1004,'Priti','Dhruwa','HR','Management',20000)");
				stmt.executeUpdate("INSERT INTO employee Values(1005,'Rajeev','Ram','GM','HR',25000)");
				stmt.executeUpdate("INSERT INTO employee Values(1006,'Sanjay','Raut','AGM','HR',26500)");
				stmt.executeUpdate("INSERT INTO employee Values(1007,'Govind','Prasun','DGM','Technology',21000)");
				stmt.executeUpdate("INSERT INTO employee Values(1008,'Sanjeev','Ranjan','Manager','Technology',23000)");
				stmt.executeUpdate("INSERT INTO employee Values(1009,'Avinash','Singh','DyManager','Technology',21000)");
				stmt.executeUpdate("INSERT INTO employee Values(1010,'Dhruv','Kumar','Developer','Technology',28000)");
				stmt.executeUpdate("INSERT INTO employee Values(1011,'Rajeev','Ranjan','Analyst','Admin',18000)");
				stmt.executeUpdate("INSERT INTO employee Values(1012,'Kumar','Saurav','Analyst','Technology',18800)");
				stmt.executeUpdate("INSERT INTO employee Values(1013,'Gaurav','Kumar','Executive','Admin',15000)");
				stmt.executeUpdate("INSERT INTO employee Values(1014,'Ashish','Kumar','SCM','Store',14500)");
				stmt.executeUpdate("INSERT INTO employee Values(1015,'Pinky','Rana','Trainee','Admin',12000)");
				System.out.println("Records inserted successfully.");
			}
			catch (Exception e)
			{	
				System.err.println(e);
			}
	}

}
