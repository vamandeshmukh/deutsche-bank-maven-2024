package com.db.demo.conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws Exception {
		
		Print print = new Print();
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
 		Future<Integer> future = executor.submit(print);
 		System.out.println(future.get());
 		System.out.println(future.get());
 		System.out.println(future.get());
	}

}

class Print implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return this.getNum();
	}

	private Integer getNum() {
		return 10;
	}

}
