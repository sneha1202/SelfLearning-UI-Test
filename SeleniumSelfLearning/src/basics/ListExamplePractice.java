package basics;

import java.util.ArrayList;
import java.util.List;

public class ListExamplePractice {
	public static void main(String[] args) 
	{
	//List Example with the strings----	
// List<String> list=new ArrayList<String>();
//	
//	list.add("abc");
//	list.add("def");
//	list.add("abc");
//	list.add("abc");
//	System.out.println("The number of list:::" +list.size());
//	System.out.println(list.get(0));

//This is another example for the list just checking it with Integer.		
 //List<Integer> list=new ArrayList<Integer>();
 
//list.add(2);
//list.add(7);
//list.add(9);
//System.out.println("The number of list:::"+list.size());
//System.out.println(list.get(0));
//System.out.println(list.get(1));
//System.out.println(list.get(2));
//
// List is a type of Collection useful to store duplicate objects.
		//In List elements are stored in index based.
		//List allows null value.
		//ArrayList,Vector and LinkedList are the classes implementing the List interface.
		//List is a type of Collection useful to store duplicate objects.
		//In List elements are stored in index based.
		//List allows null value.
		//ArrayList,Vector and LinkedList are the classes implementing the List interface.
   ArrayList aList=new ArrayList();
	aList.add("test");
	aList.add(123);
	aList.add(null);
	aList.add(55.2);
	System.out.println("Size of the list " + aList.size());
	for(int i=0;i<aList.size();i++)
	{
		System.out.println("Element at index" + i + " is " + aList.get(i));
		//Printing list of values using enhancer for loop..
		System.out.println("Printing the List of values using for-each");
		for(Object o:aList)
		{
			System.out.println("Element is "+ o);
		}
	}
	}
	
		
}
		
		


