package com.java.assi5;

import java.util.*;

public class ScoreImpl implements ScoreInt {
	private static final int NUM_OF_QUESTIONS = 5;
    private static final int MAX_SCORE_PER_QUESTION = 10;


	@Override
	public List<Score> takeExam(int numOfStudents) {
		// TODO Auto-generated method stub
		List<Score> results = new ArrayList<>();

        for (int i = 1; i <= numOfStudents; i++) {
            String studentName = "Student " + i;
            int score = calculateScore();
            results.add(new Score(studentName, score));
        }

        return results;
	}

	private int calculateScore() {
		// TODO Auto-generated method stub
		 Random rand = new Random();
	        int score = 0;
	        for (int i = 0; i < NUM_OF_QUESTIONS; i++) {
	            score += rand.nextInt(MAX_SCORE_PER_QUESTION + 1); 
	        }
	        return score;
	}

}
