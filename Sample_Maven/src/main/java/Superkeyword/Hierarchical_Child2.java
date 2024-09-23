package Superkeyword;

public class Hierarchical_Child2 extends Hierarchical_Parent {
	public void mul()
	{
		System.out.println("Multiply"+(a*b));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Hierarchical_Child2 obj = new Hierarchical_Child2();
		obj.mul();
		obj.sum();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		

	}

}
