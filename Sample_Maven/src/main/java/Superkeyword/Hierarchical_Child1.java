package Superkeyword;

public class Hierarchical_Child1 extends Hierarchical_Parent{
public void sub()
{
System.out.println("Difference is"+ (a-b));	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchical_Child1 obj= new Hierarchical_Child1();
		obj.sub();
		obj.sum();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
