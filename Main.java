package com.medina.designpattern.thread_pools;

import com.medina.designpattern.MementoPatternDemo;

public class Main {
	// Maximum number of threads in thread pool
	static final int MAX_T = 3;

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		MementoPatternDemo mementoPatternDemo = new MementoPatternDemo();
		mementoPatternDemo.mementoCreation();
		((Worker) worker).executeThread();
	}

}
