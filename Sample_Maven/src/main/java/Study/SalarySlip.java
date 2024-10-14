package Study;

public class SalarySlip extends SalaryDetails {

	public void total (double basicPay , double deduction , double bonus , double hra ,double pf)
	{
		double total = basicPay + deduction + bonus - hra - pf;
		
		System.out.print (total);
		
		
		
		
		
	}
}
