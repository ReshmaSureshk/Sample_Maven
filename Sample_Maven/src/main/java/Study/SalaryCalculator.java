package Study;

public class SalaryCalculator {

	public static void main(String[] args) {
		SalarySlip obj= new SalarySlip();
		System.out.println("Total Salary of employee is");
		obj.total(30000, 200, 4000, 20,10);
		System.out.println("Pay Slip");
		System.out.println("BasicPay"+ obj.basicPay + "Deduction"+ obj.bonus +"hra"+ obj.hra +"pf"+ obj.pf);
	
		
		// TODO Auto-generated method stub

	}

}
