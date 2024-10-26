package app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	boolean b=false;
       
    public StudentDB() {
        super();
    }
    
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver loaded.");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##guest","guest");
				System.out.println("Connection established");
			} 
			catch (ClassNotFoundException | SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		response.setContentType("text/html;charset=UTF-8");
		
		try {
			String name=request.getParameter("nm");
			String pass=request.getParameter("ps");
			String course=request.getParameter("cs");
			String email=request.getParameter("em");
			String city=request.getParameter("ct");
			String state=request.getParameter("st");
			
			
			PreparedStatement pstmt=con.prepareStatement("insert into std values(?,?,?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			pstmt.setString(3, course);
			pstmt.setString(4, email);
			pstmt.setString(5, city);
			pstmt.setString(6, state);
			b=pstmt.execute();
			
			if(b=true)
			{
				RequestDispatcher rd=request.getRequestDispatcher("saved.html");
				rd.forward(request, response);
				System.out.println("Data Saved Successfully.");
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("error.html");
				rd.forward(request, response);
				System.out.println("Data not saved.");
			}
		} catch (SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}

