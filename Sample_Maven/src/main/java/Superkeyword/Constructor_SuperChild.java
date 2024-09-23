package Superkeyword;

public class Constructor_SuperChild extends Constructor_SuperParent
{
public void print()
{
super.display();
System.out.println(super.a);
System.out.println("This is super child method");
}
public Constructor_SuperChild ()
{
	super(23);
	System.out.println("Child constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_SuperChild ob= new Constructor_SuperChild();
		ob.print(); 		
	}

}
