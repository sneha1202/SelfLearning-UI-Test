package org.h2k.java;

public class Student {
	
	static int count;
	int age=10;
    String name;
    public static void main(String[] args) {
		//System.out.println(age);// we are getting error because we can call non static variable in static block.
	
   // System.out.println(count);
    	
    	Student s1=new Student();
    	s1.age=15;
    	System.out.println(s1.age);
    	Student.count=1;
    	System.out.println(Student.count);
    	
    	System.out.println("For s2");//age will print 0 means i create object ai will get a copy of the class.
    	Student s2=new Student();
    	System.out.println(s2.age);
    	System.out.println(Student.count);
	}
}
