package Abstract;

public class SampleClass extends AbstractClass {
public void print()
{
	System.out.println("abstract method");
}
public void view()
{
System.out.println("Method in sample class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass obj=new SampleClass();
		obj.print();
		obj.view();
		obj.display();

	}

}
