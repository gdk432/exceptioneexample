package com.exception;

public class FinalizeExample {

	public void finalize() {
		System.out.println("finalize block exicuted");
	}
	
	public static void main(String args[]) {
		FinalizeExample finalizeExample = new FinalizeExample();
		FinalizeExample finalizeExampl = new FinalizeExample();
		finalizeExample=null;
		finalizeExampl=null;
		System.gc();
	}
}

