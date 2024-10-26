package users;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class RegServlet extends GenericServlet
{
	private static final long serialVersionUID = 1L;
	Connection con;
	PrintWriter pw;
	
	@Override
	public void init() throws ServletException {
		
		try {
			ServletContext sc=getServletContext();
			String s1=sc.getInitParameter("driver");
			String s2=sc.getInitParameter("url");
			String s3=sc.getInitParameter("username");
			String s4=sc.getInitParameter("password");
			Class.forName(s1);
			System.out.println("Driver Loaded");
			con=DriverManager.getConnection(s2,s3,s4);
			System.out.println("Connected to database.");
			}
			catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}	
	}
	
	@Override
	public void destroy() {
		
		try {
			con.close();
			} 
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		try {
			String s1=request.getParameter("fname");
			String s2=request.getParameter("lname");
			String s3=request.getParameter("uname");
			String s4=request.getParameter("pword");
			
			PreparedStatement pstmt=con.prepareStatement("INSERT INTO uinfo Values(?,?,?,?)");
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			pstmt.setString(3, s3);
			pstmt.setString(4, s4);
			pstmt.executeUpdate();
			
			pw=response.getWriter();
			pw.println("<html><body bgcolor=lightgreen text=maroon><center>");
			pw.println("<br><h2>You have registered successfully.</h2>");
			pw.println("<a href=login.html><h3>Login</h3></a>");
			pw.println("</center></body></html>");
			} 
			catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			//pw.println(e);
			e.printStackTrace();
			
		}
		
	}
	
}