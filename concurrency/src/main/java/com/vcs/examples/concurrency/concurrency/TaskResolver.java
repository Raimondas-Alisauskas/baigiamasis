package com.vcs.examples.concurrency.concurrency;

public class TaskResolver extends Thread {

	private TaskHolder holder;
	private int howFast;

	public TaskResolver(TaskHolder holder, int howFast) {
		this.holder = holder;
		this.howFast = howFast;
	}

	@Override
	public void run() {

		while (true) {
			resolveTask();
		}
	}

	public void resolveTask() {

		try {
			Thread.sleep(howFast);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		holder.remove();
//		if (!holder.getTasks().isEmpty()) {
//			holder.getTasks().poll();
//		}

	}

}
