package Exception;

public class SampleCustomException {
	public static void display(int age) throws LicenseException
	{
		if (age<18)
		
		{
			throw new LicenseException ("Not Eligible"); //we are throwing exception to constructor
		}
		else
		{
			System.out.println("Eligile");
		}
		
	}

	public static void main(String[] args) throws LicenseException {
		SampleCustomException obj= new SampleCustomException();
		obj.display(19);
		// TODO Auto-generated method stub

	}

}
