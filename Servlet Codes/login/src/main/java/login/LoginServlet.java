package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
				ServletContext sc=config.getServletContext();
				String s1=sc.getInitParameter("driver");
				String s2=sc.getInitParameter("url");
				String s3=sc.getInitParameter("username");
				String s4=sc.getInitParameter("password");
				Class.forName(s1);
				System.out.println("Driver loaded");
				con=DriverManager.getConnection(s2,s3,s4);
				System.out.println("Connection established.");
			}
			catch (ClassNotFoundException | SQLException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			String s1=request.getParameter("uname");
			String s2=request.getParameter("pword");
			
			PreparedStatement pstmt=con.prepareStatement("select * from uinfo where uname=? and pword=?");
			pstmt.setString(1,s1);
			pstmt.setString(2,s2);
			ResultSet rs=pstmt.executeQuery();
			
			PrintWriter pw=response.getWriter();
			//pw.println("<html><body bgcolor=red text=yellow><h1>");
			if(rs.next())
			{
				/*
				//pw.println("Welcome, "+rs.getString(1)+"!");
				pw.println("Welcome, "+rs.getString("fname")+"!");
				*/
				
				/*
				//using RequestDispatcher
				RequestDispatcher rd=request.getRequestDispatcher("/welcome");
				rd.forward(request, response);
				*/
				//using redirect
				response.sendRedirect("welcome");
			}
			else
			{
				
				//Using RequestDispatcher
				RequestDispatcher rd=request.getRequestDispatcher("/login.html");
				rd.include(request, response);
				pw.println("<center><font color=red>Invalid username/password.</font></center>");
			}
			//pw.println("</h1></body></html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
