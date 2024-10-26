package time;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class TimeServlet
 */
public class TimeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Date d=new Date();
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=yellow text=blue><h1>");
		pw.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		pw.println("</h1></body></html>");

	}

}
