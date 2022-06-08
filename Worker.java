package com.medina.designpattern.thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

public class Worker 
{
	// Maximum number of threads in thread pool
	static final int MAX_T = 3;
	public void executeThread ()
	{
		// creates five tasks
		Runnable r1 = new ThreadTask("task 1");
		Runnable r2 = new ThreadTask("task 2");
		Runnable r3 = new ThreadTask("task 3");
		Runnable r4 = new ThreadTask("task 4");
		Runnable r5 = new ThreadTask("task 5");

		// creates a thread pool with MAX_T no. of
		// threads as the fixed pool size(Step 2)
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

		// passes the Task objects to the pool to execute (Step 3)
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);

		// pool shutdown ( Step 4)
		pool.shutdown();
		
	}

}
