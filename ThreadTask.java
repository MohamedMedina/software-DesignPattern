package com.medina.designpattern.thread_pools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThreadTask implements Runnable {
	private String name;
	Date d = new Date();
	SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");

	public ThreadTask(String s) {
		name = s;
	}

	// Prints task name and sleeps for 1s
	// This Whole process is repeated 5 times

	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				if (i == 0) {

					// prints the initialization time for every task
					System.out.println("Initialization Time for" + " task name - " + name + " = " + ft.format(d));
				} else {

					System.out.println("Executing Time for task name - " + name + " = " + ft.format(d));
					// prints the execution time for every task
				}
				Thread.sleep(1000);
			}
			System.out.println(name + " complete");
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
