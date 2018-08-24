package com.vcs.examples.concurrency.concurrency;

import java.util.Random;

public class TaskProducer extends Thread {

	private TaskHolder holder;
	private int howFast;

	public TaskProducer(TaskHolder holder, int howFast) {
		this.holder = holder;
		this.howFast = howFast;
	}

	@Override
	public void run() {

		while (true) {
			makeTask();
		}
	}

	public void makeTask() {

		Random r = new Random();

		try {
			Thread.sleep(howFast);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		holder.addTask("task-" + r.nextInt(1000));

	}

}
