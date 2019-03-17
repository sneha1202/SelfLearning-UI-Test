package basics;

import java.util.HashSet;
import java.util.Set;

public class SetExamplePractice {
public static void main(String[] args) {
//	
//	Set<String> set=new HashSet<String>();//What is Hash Set so look it as class.
//	
//	set.add("abc");
//	set.add("def");
//	set.add("abc");
//	
	//System.out.println("The number of list:::"+set.size());
	
	//Iam not doing set.get(0)//Because in set get method is not available.
	
	HashSet hset= new HashSet();
	hset.add("Test");
	hset.add(123);
	hset.add(null);
	hset.add(55.22);
	System.out.println("Size of the list " + hset.size());
	
	//Printing the list of values using Enhanced for loop--
	System.out.println("Printing the List of values using for-each");
	for(Object o:hset)
	{
		System.out.println("Element is " +  o);
	}
}
}