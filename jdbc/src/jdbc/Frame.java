//Example of Java Beans

package jdbc;

import java.io.Serializable;

public class Frame implements Serializable
{

	private int width;

	public void setWidth(int width)
	{
		if(width>800)
			this.width=width;
		else if(width<0)
			this.width=0;
		else
			this.width=width;
	}
	
	public int getWidth()
	{
		return width;
	}
}

