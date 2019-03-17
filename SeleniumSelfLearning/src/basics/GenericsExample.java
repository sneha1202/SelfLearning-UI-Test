package basics;

import java.util.ArrayList;

public class GenericsExample {
	public static void main(String[] args) {
		
//		GenericsJava
//		If all the Elements in the Collection of are of Same Type,
//		then we should use Generics.
//		If a Collection is declared with Generics,we cannot store elements 
//		apart from Generic Type.
		
		
		ArrayList<String> aList=new ArrayList<String>();
		aList.add("test");
		aList.add("test1");
		aList.add(null);
		aList.add("test2");
		System.out.println("Size of the list " + aList.size());
		for(int i=0;i<aList.size();i++)
		{
			System.out.println("Element at the index " + i + "is " + aList.get(i));
		}
		
		//Printing list of values using Enhanced For loop
		
		System.out.println("Printing the List of values using for-each");
		for(Object o:aList)
		{
			System.out.println("Element is " + o);
		
	}

}
}

