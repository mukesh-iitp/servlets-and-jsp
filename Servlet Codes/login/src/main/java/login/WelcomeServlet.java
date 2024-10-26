package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String s=request.getParameter("uname");
			//PreparedStatement pstmt=con.prepareStatement("select * from uinfo where uname=?");
			//pstmt.setString(1,s);
			//ResultSet rs=pstmt.executeQuery();
			//rs.next();
			PrintWriter pw=response.getWriter();
			pw.println("<html><body bgcolor=blue text=yellow><h1>");
			//pw.println("Welcome, "+rs.getString(1)+"!");
			pw.println("Welcome, "+s+"!");
			pw.println("</h1></body></html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
