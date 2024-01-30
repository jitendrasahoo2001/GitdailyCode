package com.java.pack1;
import java.util.Scanner;

public class Exce3 {
	

	    private static final String[] QUESTIONS = {
	            "What is the capital of France?",
	            "Which planet is known as the Red Planet?",
	            "Who wrote 'Romeo and Juliet'?",
	            "What is the largest mammal in the world?",
	            "What is the square root of 64?"
	    };

	    private static final String[] ANSWERS = {
	            "Paris",
	            "Mars",
	            "William Shakespeare",
	            "Blue Whale",
	            "8"
	    };

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            int score = 0;

	            for (int i = 0; i < QUESTIONS.length; i++) {
	                System.out.println("Question " + (i + 1) + ": " + QUESTIONS[i]);
	                System.out.print("Your answer: ");
	                String userAnswer = scanner.nextLine();

	                if (userAnswer.equalsIgnoreCase(ANSWERS[i])) {
	                    System.out.println("Correct\n");
	                    score++;
	                } else {
	                    System.out.println("Incorrect. The correct answer is: " + ANSWERS[i] + "\n");
	                }
	            }

	            System.out.println("Quiz completed! Your final score: " + score + " out of " + QUESTIONS.length);
	        } finally {
	            scanner.close();
	        }
	    }
	}



