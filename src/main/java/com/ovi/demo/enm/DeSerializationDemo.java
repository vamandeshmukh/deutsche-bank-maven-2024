package com.ovi.demo.enm;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String args[]) throws IOException, ClassNotFoundException {

		System.out.println("Start");
		FileInputStream fis = new FileInputStream("Shilpa.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee empObj = (Employee) ois.readObject();
		System.out.println(empObj.toString());

		ois.close();
		fis.close();
		System.out.println("End");
	}

}
