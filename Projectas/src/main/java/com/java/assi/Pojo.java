package com.java.assi;

public class Pojo {
	private int taskId;
    private String taskName;
    private boolean completed;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public Pojo(int taskId, String taskName, boolean completed) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.completed = completed;
	}
	public Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pojo [taskId=" + taskId + ", taskName=" + taskName + ", completed=" + completed + "]";
	}
    
    

}
