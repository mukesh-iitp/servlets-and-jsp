package bean;

import java.io.Serializable;

public class MessageBean implements Serializable
{
	private String message;
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}

