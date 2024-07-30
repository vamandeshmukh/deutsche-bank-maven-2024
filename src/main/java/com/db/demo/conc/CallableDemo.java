package com.db.demo.conc;

import java.util.concurrent.Callable;

public class CallableDemo {

	public static void main(String[] args) throws Exception {
		
		Print print = new Print();
		System.out.println(print.call());

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
