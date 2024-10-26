package app;

import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class ImageServlet
 */
public class ImageServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Mukesh\\eclipse-workspace\\FirstApp\\src\\main\\java\\app\\flower.JPG");
		int n=fis.available();
		byte[] b=new byte[n];
		fis.read(b);
		ServletOutputStream sos=response.getOutputStream();
		sos.write(b);
	}
 
}
