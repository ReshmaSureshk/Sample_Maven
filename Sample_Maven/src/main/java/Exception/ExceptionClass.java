package Exception;

public class ExceptionClass {
	public void display()
	{
		int a=10;
		int b= a/0;
		System.out.println(b);
	}

	public static void main(String[] args) {
		ExceptionClass obj= new ExceptionClass();
		System.out.println("hello");// will execute
		obj.display();// will not execute because of exception
		
		// TODO Auto-generated method stub

	}

}
