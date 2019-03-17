package org.h2k.java;

import java.io.File;

public class Constructor {
	int i;
	Constructor()
	{
		this.i=10;
		System.out.println("in default Constructor Printing the value of this ::" + this);
	}
	Constructor(int i1)
	{	
	 System.out.println("In Parametrized");
	 this.i=i1;
	}
	public static void main(String[] args) {
		
		Constructor c1=new Constructor();
		System.out.println("Printing the value of c1" + c1.i + "" +c1);
		
		
		Constructor c2=new Constructor();
		
		System.out.println("Printing the value of c2" + c2.i+"" +c2);
	
		Constructor c3=new Constructor();
		System.out.println(c3.i);
	}

}
