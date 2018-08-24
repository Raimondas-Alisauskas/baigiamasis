package com.vcs.examples.concurrency.concurrency;

public class TaskWatcher extends Thread {

	private TaskHolder holder;
	private int howFast;

	public TaskWatcher(TaskHolder holder, int howFast) {
		this.holder = holder;
		this.howFast = howFast;
	}

	@Override
	public void run() {

		while (true) {
			report();
		}
	}

	public void report() {

		try {
			Thread.sleep(howFast);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String line = "[";

		int size = holder.getSize();
		int sizeI = (size > 120 ? 120 : size);

		for (int i = 0; i < sizeI; i++) {
			line += "=";
		}

		line += "]";

		if (sizeI != size) {
			line += " : " + size;
		}

		System.out.println(line);

	}

}
