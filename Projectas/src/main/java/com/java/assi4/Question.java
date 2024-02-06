package com.java.assi4;

public class Question {
	private String question;
	
    private String answer;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question [question=" + question + ", answer=" + answer + "]";
	}
    
    

}
