//Example of Java Beans

package jdbc;

import java.io.Serializable;

public class Message implements Serializable
{
	private String message;
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return this.message;
	}

}
