package com.db.demo.inherit;

abstract class Rbi {

	public abstract void acceptDeposits();

}

interface IndiaGovt {
	
//	public abstract void payTax();
	void payTax();
	
}

interface StateGovt {
	
	public abstract void paySalary();
	
}

class HdfcBank extends Rbi implements IndiaGovt, StateGovt {

	public void payInterest() {
		System.out.println("Paying interest");
	}

	@Override
	public void acceptDeposits() {
		System.out.println("Accpeting deposits");
	}

	@Override
	public void payTax() {
		System.out.println("Paying 18% tax");
	}

	@Override
	public void paySalary() {
		System.out.println("Paying salary");
	}

}

//// concrete class 
//class HdfcBank {
//
//	// concrete method
//	public void payInterest()  // method signature - what? 
//	{ 							// method body - how?
//		System.out.println("Paying interest");
//	}
//
//}
//
//// abstract class 
//abstract class Rbi {
//
//	// abstract method 
//	public abstract void acceptDeposits(); // method signature - what? 
//	
//}

public class Banks {

}
