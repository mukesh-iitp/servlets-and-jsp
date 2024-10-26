package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("doGet() method of HttpServlet class called.");
		response.setContentType("text/html");
   		PrintWriter pw=response.getWriter();
   		pw.println("<h1>Implementing servlet using Servlet Interface.<br><br>Java is awesome!</h1>");
   		pw.println("Today's date is: "+new Date().toString());
	}
}
