package com.ovi.demo.enm;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Integer id;
		String name;
		Double salary;
		String file;
		FileOutputStream fos;
       	ObjectOutputStream oos;


		System.out.println("Enter emolpyee details: ");
		System.out.println("Id:");
		id = sc.nextInt();
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Salary:");
		salary = sc.nextDouble();

		Employee emp = new Employee(id, name, salary);		
		System.out.println(emp.toString());
		
		file = emp.getName() + ".ser";
		fos = new FileOutputStream(file);
		oos = new ObjectOutputStream(fos);
		
       	oos.writeObject(emp);
       	System.out.println("Object serialized.");
       	oos.close();
       	fos.close(); 
		sc.close();
		
		System.out.println("End");
	}

}
