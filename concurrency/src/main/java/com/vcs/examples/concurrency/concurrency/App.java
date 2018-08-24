package com.vcs.examples.concurrency.concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 * Concurrency
 *
 */
public class App {
	public static void main(String[] args) {

		TaskHolder taskList = new TaskHolder();

		TaskWatcher arbitras = new TaskWatcher(taskList, 1000);
		arbitras.start();

		List<TaskProducer> mangment = new ArrayList<>();
		mangment.add(new TaskProducer(taskList, 2));
		mangment.add(new TaskProducer(taskList, 3));
		mangment.add(new TaskProducer(taskList, 2));
		mangment.add(new TaskProducer(taskList, 3));
//		mangment.add(new TaskProducer(taskList, 2));
//		mangment.add(new TaskProducer(taskList, 3));
//		mangment.add(new TaskProducer(taskList, 3));

		for (TaskProducer pm : mangment) {
			pm.start();
		}

		List<TaskResolver> developers = new ArrayList<>();
//		developers.add(new TaskResolver(taskList, 22));
//		developers.add(new TaskResolver(taskList, 50));
//		developers.add(new TaskResolver(taskList, 15));
//		developers.add(new TaskResolver(taskList, 22));
		developers.add(new TaskResolver(taskList, 5));
		developers.add(new TaskResolver(taskList, 2));
		developers.add(new TaskResolver(taskList, 1));

		for (TaskResolver dev : developers) {
			dev.start();
		}

	}
}
