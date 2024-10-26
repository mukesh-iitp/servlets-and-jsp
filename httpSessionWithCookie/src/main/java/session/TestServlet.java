package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession hs=request.getSession();
		PrintWriter pw=response.getWriter();
		
		pw.println("<html><body bgcolor=green text=yellow><h1>");
		pw.println("Session ID: "+hs.getId()+"<br>");
		pw.println("Creation time: "+new Date(hs.getCreationTime())+"<br>");
		pw.println("Last Accessed time: "+new Date(hs.getLastAccessedTime())+"<br>");
		pw.println("Time Interval: "+hs.getMaxInactiveInterval()+" seconds.<br.");
		pw.println("</h1></body></html>");
	}

}
