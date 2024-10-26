package app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.setContentType("text/html:charset=UTF-8");
		
		
		String n=request.getParameter("nm");
		String c1=request.getParameter("cs");
		String e=request.getParameter("em");
		String c2=request.getParameter("ct");
		String s=request.getParameter("st");
		
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=red text=yellow><h2>");
		
		pw.println("Hello, "+n+"!<br>");
		pw.println();
		pw.println("Received your below details: <br>");
		pw.println("Course: "+c1+"<br>");
		pw.println("E-Mail: "+e+"<br>");
		pw.println("City: "+c2+"<br>");
		pw.println("State: "+s+"<br>");
		
		pw.println();
		pw.println(n+" "+c1+" "+e+" "+c2+" "+s);
		
		pw.println("</h2></body></html>");
	}

}
