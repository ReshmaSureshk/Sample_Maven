package encapsulation;

public class EncapsulatedClass
{
private String username;
private int age;
public void setter(String username,int age) 
{
	this.username= username;//giving local variable to instance variable
	this.age=age;
}
public void getter()
{
System.out.println(username);
age=age*2;
System.out.println(age);
}
	

	}


