package app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class GenericServletDemo
 */
public class GenericServletDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;
       	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
       	{
       		
       		System.out.println("service() method of GeneicServlet class called.");
       		response.setContentType("text/html");
       		PrintWriter pw=response.getWriter();
       		pw.println("<h1>Implementing servlet using GenericServlet Class.<br><br>Java is awesome!</h1>");
       		
       		
       	}

}
