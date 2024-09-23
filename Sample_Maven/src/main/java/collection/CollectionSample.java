package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) {
		ArrayList a =new ArrayList();//non generic
		a.add("hello");
		a.add(0.23f);
		a.add(20);
		a.add('d');
		System.out.println(a);
		// TODO Auto-generated method stub
ArrayList<String> b= new ArrayList();//generic array list
b.add("Hello");
b.add("hey");
b.add("how");
b.add("you");
System.out.println(b);
b.remove(0);
System.out.println(b);

ArrayList<String> c= new ArrayList(); 
c.add("I");
c.add("am");
c.addAll(b);//adding objects from one array list to another
System.out.println(c);
c.removeAll(c);
System.out.println(c);// completely remove that array list

//to get particular elements in a list

System.out.println(b.get(2));

//to get the size of an array

System.out.println(b.size());

//Contains: to check whether an obj is in the array list or not it will be in boolean 
//this will return true since how is in the array list b
boolean s= b.contains("how");
System.out.println(s);
//this will return false as output since ki is not present in the list b
boolean f =b.contains("k");
System.out.println(f);
//iterator
Iterator it = a.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	
}
it.remove();
System.out.println(a);//removed last index element in array list a


	}

}
