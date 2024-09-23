package Exception;

public class ThrowException {
public static void display(int age)
{
	if (age<18)
	
	{
		throw new ArithmeticException ("Not Eligible"); //we are throwing exception to constructor
	}
	else
	{
		System.out.println("Eligile");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.display(12);
		//System.out.println("print");
	}

}
