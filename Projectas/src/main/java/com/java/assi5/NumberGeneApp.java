package com.java.assi5;

import java.util.List;

public class NumberGeneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfThreads = 2;
        int numOfNumbersPerThread = 5;

        NumberGeneInt numberGenerator = new NumberGeneImpl();
        List<NumberGene> results = numberGenerator.generateNumbers(numOfThreads, numOfNumbersPerThread);

        
        for (NumberGene result : results) {
            System.out.println("Thread Name: " + result.getThreadName() + ", Sum: " + result.getSum());
        }

	}

}
