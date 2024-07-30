package com.db.demo.solid.srp;

//without following Single repso principle 

//public class User {
//
//	private String name;
//	private String email;
//
//	// getters, setters, constructors etc
//
//	public void addUser(User user) {
//
//	}
//
//	public void updateUser(User user) {
//
//	}
//
//	public void deleteUser(User user) {
//
//	}
//
//	public void sendEmailToUser(User user) {
//
//	}
//
//}
////

//following Single repso principle 


public class User {

	private String name;
	private String email;

	// getters, setters, constructors etc

}


class UserManagement {


	public void addUser(User user) {

	}

	public void updateUser(User user) {

	}

	public void deleteUser(User user) {

	}
}


class UserCommunication {

	public void sendEmailToUser(User user) {

	}

}







