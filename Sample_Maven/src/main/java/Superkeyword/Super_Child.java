package Superkeyword;

public class Super_Child extends Super_Parent
{
public void display()
{
	System.out.println("This is super child");
	super.print();
	System.out.println(super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super_Child obj =new Super_Child();
obj.display();
	}

}
