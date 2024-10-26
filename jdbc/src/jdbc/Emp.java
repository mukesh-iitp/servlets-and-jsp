//Example of Java Beans

package jdbc;

import java.io.Serializable;

public class Emp implements Serializable
{
	private int age;
	
	public void setAge(int age)
	{
		if(age>60)
			this.age=60;
		else if(age<21)
			this.age=21;
		else
			this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}
