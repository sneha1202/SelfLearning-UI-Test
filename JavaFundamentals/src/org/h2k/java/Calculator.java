package org.h2k.java; //This file exist in package name Math API.
  import java.io.File;
  public class Calculator {
	int i; //this is global this not between block of statement its global
//	/* Method name add
//	 * Arguments/paranthesis int a,int b
//	 * Return value c
//	 * Return type int
//	 * local variable a,b,c  these are within the methods
//	 * class name calculator
//	 * Package name org.h2k.java ,package name will always in lower case.
//	 /*Reusability
//	 *  avoid duplication of code
//	 /*  This method is non static
//	 
	File f=new File("");
	
   public int add(int a,int b)//this method is non static.
	{
		//f.exists();
		//f.renameTo(f);
	 int c=a+b;
		System.out.println(a+b);
		return c; 
	}
   public void display()
   {
	   System.out.println(i);
   }
    
	public static int substract(int a,int b) //this method is static.
	{
		int c=a-b;
		return c;
	}
	
		public static int square(int x)
		{
			int c=x*x;
			return c;
		}
		public int divide(int a,int b)
		{
			int c=a/b;
			return c;
		}
		
		public int factorial(int a)
		{
			int c=1;		
		for(int i=a;i>0;i--)
		 c=c*i;
		return c;
		}
		
  
  }
	
	
	


