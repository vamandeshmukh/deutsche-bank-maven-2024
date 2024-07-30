package com.db.demo.inherit;

//// How to use an abstract method from an interface? 

//
//// option 1 - a concrete class has to implement this interface 
//public class InheritDemo {
//	
//	public static void main(String[] args) {
//		
//		ConcreteClass concreteClass = new ConcreteClass();
//		concreteClass.regularMethod();
//		concreteClass.anotherRegularMethod();
//	}
//}

//How to use an abstract method from an interface? 

//option 2 - use anonymous inner concrete class  
public class InheritDemo {

	public static void main(String[] args) {
		// not allowed in java
//		RegularInterface regularInterface = new RegularInterface(); // CE 

//		RegularInterface regularInterface = new RegularInterface() {};

		RegularInterface regularInterface = new RegularInterface() {
			@Override
			public void regularMethod() {
				System.out.println("Regular method implemented in anonymous inner class");
			}

			@Override
			public void anotherRegularMethod() {
				System.out.println("Another regular method implemented in anonymous inner class");
			}
		};
		regularInterface.regularMethod();
		regularInterface.anotherRegularMethod();

	}
}


////How to use an abstract method from an interface? 
//
////option 3 - use lambda expression 

//public class InheritDemo {
//
//}




//package com.db.demo.inherit;
//
//public class InheritDemo {
//	
//	public static void main(String[] args) {
//		
//		HdfcBank bank1 = new  HdfcBank();
//		bank1.acceptDeposits();
//		bank1.payInterest();
//		
//
//	}
//}
//
//
//
