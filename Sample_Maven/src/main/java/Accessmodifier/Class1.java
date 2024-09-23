package Accessmodifier;

public class Class1 {
	
	void defaultMethod()
	{
		System.out.println("hey this is deafult");
		}
	
	public void print()
	{
		System.out.println("public method");
	}
private void privateMethod()
{
	System.out.println("within class private method");
}
protected void protectedMethod()
{
System.out.println("This is protected");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class1 obj=new Class1();
obj.print();
obj.privateMethod();
obj.defaultMethod();
obj.protectedMethod();
	}

}
