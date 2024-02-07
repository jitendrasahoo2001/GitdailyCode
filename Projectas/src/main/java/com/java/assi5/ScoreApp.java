package com.java.assi5;

import java.util.List;

public class ScoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numOfStudents = 5;

	        ScoreInt examTaker = new ScoreImpl();
	        List<Score> results = examTaker.takeExam(numOfStudents);

	        
	        for (Score result : results) {
	            System.out.println("Student Name: " + result.getStudentName() + ", Score: " + result.getScore());
	        }

	}

}
