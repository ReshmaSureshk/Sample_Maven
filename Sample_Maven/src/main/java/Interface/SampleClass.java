package Interface;

public class SampleClass implements InterfaceSample1 {
	public void display()
	{
		System.out.println("Abstract method1");
	}
	public void add()
	{
		System.out.println("sum is"+(a+b) );
	}
	public void print()
	{
		System.out.println("Sample class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleClass obj=new SampleClass();
obj.display();
obj.add();
obj.print();
System.out.println(obj.a);
System.out.println(obj.b);
InterfaceSample1 obj1=new SampleClass();
obj1.display();
obj1.add();
//obj1.print();
System.out.println(obj1.a);
System.out.println(obj1.b);


	}

}
