package org.h2k.java;
// when you are developing api you dont  need main method.
public class EndUser {
	public static void main(String[] args) {
		
		//cretae an object
		
   Calculator cal=new Calculator();
   int result=cal.add(2,3);
     System.out.println(result);
    //object is an real world entity which has state and behavour we call it an object.
   
 cal.display();
 
 result =Calculator.substract(2,3);
 System.out.println(result);

 
 result=cal.square(4);
 System.out.println(result);
  
result =cal.divide(2, 3);
System.out.println(result);

 result=cal.factorial(5);
 System.out.println(result);
	}
	

}
