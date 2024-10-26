package jdbc;

class JavaBeansDemo
{
	public static void main(String[] args) 
	{
		Emp e=new Emp();
		e.setAge(12);
		System.out.println(e.getAge());
		e.setAge(25);
		System.out.println(e.getAge());
		
		
		Frame f=new Frame();
		f.setWidth(200);
		System.out.println(f.getWidth());
		
		Message m=new Message();
		m.setMessage("Java is awesome");
		System.out.println(m.getMessage());
	}
	
}
