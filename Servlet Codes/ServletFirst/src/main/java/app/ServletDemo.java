package app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServletDemo implements Servlet {
	
	ServletConfig config;

	public void init(ServletConfig config) throws ServletException 
	{
		this.config=config;
		System.out.println("Object created.");
	}
	public ServletConfig getServletConfig() 
	{
		return this.config;
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		System.out.println("service() method of Servlet interface called.");
		response.setContentType("text/html");
   		PrintWriter pw=response.getWriter();
   		pw.println("<h1>Implementing servlet using Servlet Interface.<br><br>Java is awesome!</h1>");
		
	}
	public String getServletInfo() 
	{
		return "Hello User"; 
	}
	public void destroy() 
	{
		System.out.println("destroy() method called.");
		
		
	}
}
