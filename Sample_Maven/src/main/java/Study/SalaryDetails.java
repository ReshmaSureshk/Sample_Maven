package Study;

public class SalaryDetails extends Employee {
	double hra;
	double pf;
	
	public void Calculate(int basic)
	{
		this.hra=basic*0.05;
		this.pf= basic*0.20;
		
	}
	

}
