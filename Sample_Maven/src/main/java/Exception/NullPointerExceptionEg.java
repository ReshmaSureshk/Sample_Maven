package Exception;

public class NullPointerExceptionEg 
{
String a=null;
public void stringlen()
{
System.out.println(a.length());	
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NullPointerExceptionEg obj= new NullPointerExceptionEg();
		obj.stringlen();
	}

}
