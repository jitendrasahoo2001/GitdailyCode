package com.java.assi;

import java.util.*;

public class TaskManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pojo> taskList = new ArrayList<>();

        Pojo task1 = new Pojo(1, "Complete Project", false);
        Pojo task2 = new Pojo(2, "Prepare presentation", true);

        taskList.add(task1);
        taskList.add(task2);

        System.out.println("Task List:");
        for (Pojo task : taskList) {
            System.out.println("Task ID: " + task.getTaskId());
            System.out.println("Task Name: " + task.getTaskName());
            System.out.println("Completed: " + task.isCompleted());
        }

	}

}
