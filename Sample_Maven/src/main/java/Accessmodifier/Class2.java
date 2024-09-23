package Accessmodifier;

public class Class2 {
	public void display()
	{
		System.out.println("method in class2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class1 ob=new Class1();
ob.print();
//ob.privateMethod();//same package different class no visibility//
ob.defaultMethod();
ob.protectedMethod();
	}

}
