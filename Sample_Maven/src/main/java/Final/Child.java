package Final;

public class Child extends Parent

	
	{
	final int b=17;
	int c=40;
	//public  void display()// if parent has final method then child can't be overridden
	{
		//b=50; since b is declared as final we can't change
		//c=50; //here we can change since it is not final
	}
		public static void main(String[]args) {
			Child obj=new Child();
			obj.display();
			
	}

}
