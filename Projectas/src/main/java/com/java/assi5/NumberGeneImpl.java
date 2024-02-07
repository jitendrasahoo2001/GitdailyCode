package com.java.assi5;

import java.util.*;

public class NumberGeneImpl implements NumberGeneInt {

	@Override
	public List<NumberGene> generateNumbers(int numOfThreads, int numOfNumbers) {
		// TODO Auto-generated method stub
		 List<NumberGene> results = new ArrayList<>();

	        for (int i = 1; i <= numOfThreads; i++) {
	            String threadName = "Thread " + i;
	            int sum = generateAndCalculateSum(numOfNumbers);
	            results.add(new NumberGene(threadName, sum));
	        }

	        return results;
	}

	private int generateAndCalculateSum(int numOfNumbers) {
		// TODO Auto-generated method stub
		Random rand = new Random();
        int sum = 0;
        for (int i = 0; i < numOfNumbers; i++) {
            int num = rand.nextInt(100);
            sum += num;
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        return sum;
	}

}
