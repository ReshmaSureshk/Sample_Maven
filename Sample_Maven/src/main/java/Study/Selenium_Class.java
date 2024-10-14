package Study;

public class Selenium_Class {
	
	public boolean Check (int number)
	{
		if (number>=10 && number<=99)
		{
		return true ;
		}
		else 
		{
		return false;
		}
	}
	

	public static void main(String[] args) {
		Selenium_Class obj= new Selenium_Class();
		System.out.println(obj.Check (22));
		// TODO Auto-generated method stub

	}

}
