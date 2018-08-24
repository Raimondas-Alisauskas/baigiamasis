package com.vcs.examples.concurrency.concurrency;

import java.util.ArrayList;
import java.util.List;

public class TaskHolder {

	// private Queue<String> tasks = new ConcurrentLinkedQueue<>();

	/**
	 * ArrayList - not threadSafe!!!
	 */
	private List<String> tasks = new ArrayList<>();

	public void addTask(String task) {
		synchronized (tasks) {
			tasks.add(task);
		}
	}

	public int getSize() {
		synchronized (tasks) {
			return tasks.size();
		}
	}

	public void remove() {

		synchronized (tasks) {
			if (!tasks.isEmpty()) {
				tasks.remove(0);
			}
		}

	}

}
