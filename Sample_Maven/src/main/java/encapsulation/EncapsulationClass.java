package encapsulation;

public class EncapsulationClass {

	private String employeename;
	private int salary;
	public void setter(String employeename,int salary)
	{
	this.employeename= employeename;
	this.salary=salary;
	}
public void getter()
{
System.out.println(employeename);
salary= salary+200;
System.out.println(salary);
}

}
