package com.java.assi4;

import java.util.List;
import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String fileName = "D:\\New folder\\questions.txt";
	        Questionreader questionReader = new QuestionReaderImpl();

	        List<Question> questions = questionReader.readQuestionsFromFile(fileName);

	        int score = administerQuiz(questions);

	        System.out.println("Quiz Complete Your score: " + score + "/" + questions.size());

	}

	private static int administerQuiz(List<Question> questions) {
		// TODO Auto-generated method stub
		int score=0;
		Scanner scanner = new Scanner(System.in);
		
		for(Question question:questions) {
			System.out.println("Question: "+question.getQuestion());
			System.out.println("Your Answer: ");
			String userAnswer = scanner.nextLine();
			
			if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
                score++;
            }
		}
		return score;
	}

}
