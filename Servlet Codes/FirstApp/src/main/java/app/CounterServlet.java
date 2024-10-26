package app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class CounterServlet
 */
public class CounterServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	
	int count=0;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public CounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		count++;
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=blue text=yellow><h1>");
		pw.println("This page has been accessed "+count+" times.");
		pw.println("</h1></body></html>");
	}

}
