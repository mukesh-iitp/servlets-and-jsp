package hidden;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetFields
 */
public class GetFields extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFields() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=red text=yellow>");
		pw.println("<h1><u>Selected Books:</u></h1><br>");
		if(!s1.equals("null"))
			pw.println(s1+"<br>");
		if(!s2.equals("null"))
			pw.println(s2+"<br>");
		if(!s3.equals("null"))
			pw.println(s2+"<br>");
		pw.println("</body></html>");	
		
	}

}
