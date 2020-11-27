package com.exception;

public class SecondExample {

	public static void main(String args[]) {
		try {
			int a[]= new int[5];
			a[5]=30/0;
			
		}
		catch(Exception e){
			System.out.println("common task completed");
			
		}
		catch(ArithmeticException e) {
			
		}
	}
}
