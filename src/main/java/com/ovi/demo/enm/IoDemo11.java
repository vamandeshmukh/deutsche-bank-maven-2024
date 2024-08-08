package com.ovi.demo.enm;

import java.io.*;

public class IoDemo11 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		fis = new FileInputStream("sample.txt");
		System.out.println("Opening file...");
		// Thread.sleep(1000);
		while (fis.available() > 0) {
			System.out.print((char) fis.read());
		}
		System.out.println("\n--end--");
		fis.close();
	}
}
