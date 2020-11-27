package com.exception;

public class FirstExample {

	
	public static void main(String args[]) {
		try {
			int a[]=new int[5];  
			a[10]=50; //ArrayIndexOutOfBoundsException  
			
			String se="abc";  
			int i=Integer.parseInt(se);//NumberFormatException 
			
			String s=null;  
			System.out.println(s.length());//NullPointerException  
			
			int data =100/0;//ArithmeticException  
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		System.out.println("Rest of the code after exception");
	}
}
