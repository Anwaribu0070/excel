package org.cts.test;

public class same1 {
	
	public  void cmpId() {
		System.out.println("12345678");
	}

	public  void cmpName() {
		System.out.println("DLF");

	}
	
	public  void cmpAdd() {
		System.out.println("chennai");

	}
	
	public static void main(String[] args) {
		
		same1 obj1=new same1();
		obj1.cmpId();
		obj1.cmpName();
		obj1.cmpAdd();
		
		same obj=new same();
		obj.empId();
		obj.empNmae();
		obj.empLoc();
	}
}
