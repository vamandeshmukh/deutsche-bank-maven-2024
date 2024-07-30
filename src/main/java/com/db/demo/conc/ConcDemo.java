package com.db.demo.conc;


public class ConcDemo {
	
	public static void main(String[] args) {
		
//		Print print = new Print();
//		print.printNums();
//		print.printNums();
//		print.printNums();
		
		Thread thread = new Thread(new Print());
		thread.start();
		Thread thread2 = new Thread(new Print());
		thread2.start();
		Thread thread3 = new Thread(new Print());
		thread3.start();
		Thread thread4 = new Thread(new Print());
		thread4.start();

		
	}

}


class Print extends Thread {
	
	@Override
	public void run() {
		this.printNums();
	}
	
	public void printNums() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}	
}