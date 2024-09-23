package accessmodifier1;

import Accessmodifier.Class1;

public class Class4 extends Class1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class4 obj=new Class4();
obj.print();
//obj.privateMethod(); not visible in outside package by subclass
//obj.defaultMethod();not visible in outside package by subclass-default
obj.protectedMethod();
//protected visible outside package subclass
	}

}
