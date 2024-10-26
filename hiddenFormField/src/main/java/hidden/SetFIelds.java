package hidden;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetFIelds
 */
public class SetFIelds extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetFIelds() {
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
		pw.println("<html><body bgcolor=green text=yellow><center>");
		pw.println("<form action=get>");	//from submission always required.
		pw.println("<input type=hidden name=book1 value="+s1+">");
		pw.println("<input type=hidden name=book2 value="+s2+">");
		pw.println("<input type=hidden name=book3 value="+s3+">");
		pw.println("<h1>Your books are added to Cart</h1>");
		pw.println("<input type=submit value=next>");
		pw.println("</form></center></body></html>");
	}

}
