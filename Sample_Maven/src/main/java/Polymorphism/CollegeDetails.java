package Polymorphism;

public class CollegeDetails extends StudentDetails{
	
	public void student(String name,String collegename,int age,String Department)
	{
		System.out.println(name+" from " + collegename+" is " + age+" studying " + Department+"");
		
	}

	public static void main(String[] args) {
		CollegeDetails obj=new CollegeDetails();
		obj.student("Kiki", "Conestoga", 22, "IT");
		StudentDetails obj1=new StudentDetails();
		obj1.student("Kiara","Waterloo", 21,"Computer Science");
		// TODO Auto-generated method stub

	}

}
