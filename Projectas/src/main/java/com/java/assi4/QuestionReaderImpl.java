package com.java.assi4;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class QuestionReaderImpl implements Questionreader {

	@Override
	public List<Question> readQuestionsFromFile(String fileName) {
		// TODO Auto-generated method stub
		List<Question> questions= new ArrayList<>();
		
		try (FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String question, answer;
            while ((question = bufferedReader.readLine()) != null && (answer = bufferedReader.readLine()) != null) {
                questions.add(new Question(question, answer));
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error reading the file: " + e.getMessage());
			}
		
		return questions;
	}
	

}
