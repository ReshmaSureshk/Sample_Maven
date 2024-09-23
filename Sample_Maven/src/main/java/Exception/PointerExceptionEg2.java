package Exception;

public class PointerExceptionEg2 
{
static String a=null;
public static void display()
{
	try
	{
		System.out.println(a.length());
	}
	catch(NullPointerException n)
	{
		System.out.println("Null Pointer ExceptionEg2 handled ");
	}
	finally
	{
		System.out.println("Final statement");
	}
	
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PointerExceptionEg2.display();
	}

}
