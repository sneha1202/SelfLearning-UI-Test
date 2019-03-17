package basics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
	String s=new String("abc");
	String s1=new String("def");
	List<String> strList=new ArrayList<String>();
	strList.add(s);
	strList.add(s1);
	System.out.println("Number of item in the list" +strList.size());
	for(int i=0;i<strList.size();i++)
	{
		System.out.println(strList.get(i));
	}
	
	//List is datastructure  useful to store the duplicate object.
	//set is datastructure  useful to store unique object. Set has size method.Set does not use get method.
	//Premitive Datatype java api has provided a Wrapper classess.
	//
	//Premitive Datatype
	//Wrapper Classess
	//int integer
	//char character
	
	
	
		
	}

}
