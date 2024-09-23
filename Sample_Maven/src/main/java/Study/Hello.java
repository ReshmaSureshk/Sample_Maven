package Study;

public class Hello {
public static void main (String args [])
{
	int a= 5;
	int b= 10;
	
	System.out.println("before swapping ");
	System.out.println("value of a is" +a);
	System.out.println("value of b is" +b);
	a= a+b;
	b =a-b;
	a=a-b;
	System.out.println("After swapping ");
	System.out.println("value of a is" +a);
	System.out.println("value of b is" +b);
	}
}
