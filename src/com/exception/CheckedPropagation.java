package com.exception;

public class CheckedPropagation {

	void m() {
		throw new java.io.IOException("device error");
	}
	
	void n() {
		m();
	}
	
	void p() {
		
		try {
			n();
		}
		
		catch(Exception e){
			System.out.println("Exception handled");
		}
		
		
	}
	
	public static void main(String args[]) {
		CheckedPropagation checkedPropagation = new CheckedPropagation();
		checkedPropagation.p();
		System.out.println("Normal flow");
	}
}
