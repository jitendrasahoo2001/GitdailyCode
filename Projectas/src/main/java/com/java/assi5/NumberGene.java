package com.java.assi5;

public class NumberGene {
	private String threadName;
	
    private int sum;

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "NumberGene [threadName=" + threadName + ", sum=" + sum + "]";
	}

	public NumberGene(String threadName, int sum) {
		super();
		this.threadName = threadName;
		this.sum = sum;
	}

	public NumberGene() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
