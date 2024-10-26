package table;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class TableServlet
 */
public class TableServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=yellow text=blue>");
		pw.println("<table border=20>");
		for(int i=1;i<=100;i++)
		{
			//pw.println("<tr><td>5</td><td>x</td><td>"+i+"</td><td>=</td><td>"+5*i+"</td></tr>");
			//(or)
			pw.println("<tr>");
			pw.println("<td>5</td>");
			pw.println("<td>x</td>");
			pw.println("<td>"+i+"</td>");
			pw.println("<td>=</td>");
			pw.println("<td>"+5*i+"</td>");
			pw.println("</tr>");
		}
		pw.println("</table></body></html>");
	}

}
