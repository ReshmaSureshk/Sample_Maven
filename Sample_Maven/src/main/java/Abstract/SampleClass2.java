package Abstract;

public class SampleClass2 extends AbstractClass2 {
	public void Student(int age,int roll,String name)
	{ 
		System.out.println(age +" "  +roll+""  +name+"");
	}

	public void display()
	{
		System.out.println("hello student");
	}
	SampleClass2()
	{
		super();
	}
	public static void main(String[] args) {
		SampleClass2 obj=new SampleClass2();
		obj.Student(22,34,"kiara");
		obj.display();
		
		
		// TODO Auto-generated method stub

	}

}
