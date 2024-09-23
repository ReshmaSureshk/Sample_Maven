package Exception;

public class ExceptionHandling1 {
	int a=10;
	public void divide()
	{
		try 
		{
			int d=a/0;
			System.out.println(d);
		}
		
		/*catch(Exception e)//used to handle exception occured in try statement
		{ 
			System.out.println("Exception Handling");
			System.out.println(e);
		}
		*/
		finally //it will execute always even if exception handled or not
		{
			System.out.println("Finally block");
		}
	}


public static void main(String[] args) {
	ExceptionHandling1 obj= new ExceptionHandling1();
	obj.divide();
	System.out.println("End of statement");

	
	}

}
