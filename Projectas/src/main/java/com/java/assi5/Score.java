package com.java.assi5;

public class Score {
	private String studentName;
	
    private int score;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Score(String studentName, int score) {
		super();
		this.studentName = studentName;
		this.score = score;
	}

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Score [studentName=" + studentName + ", score=" + score + "]";
	}
    
    
    

}
