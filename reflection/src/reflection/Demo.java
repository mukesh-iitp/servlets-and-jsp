package reflection;

import java.lang.reflect.Method;

public class Demo 
{
	public static void main(String[] args) {
		try {
			Class c=Class.forName(args[0]);
			Method[] m=c.getMethods();
			for(Method m2:m)
				System.out.println(m2);
		}catch (Exception e) {
			System.err.println(e);
		}
	}

}
