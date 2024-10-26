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
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		pw.println("<html><body bgcolor=red text=yellow><h1>");
		pw.println("Session ID: "+hs.getId()+"<br>");
		pw.println("Creation Time: "+new Date(hs.getCreationTime())+"<br>");
		pw.println("Last Accessed Time: "+new Date(hs.getLastAccessedTime())+"<br>");
		pw.println("Time Interval of Session: "+ hs.getMaxInactiveInterval()+" Seconds");
		pw.println("</h1></body></html>");
	}

}
