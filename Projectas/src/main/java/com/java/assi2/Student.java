package com.java.assi2;

import java.util.Map;

public class Student {
	   private String studentId;
	   
	   private Map<String, Integer> grades;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Map<String, Integer> getGrades() {
		return grades;
	}

	public void setGrades(Map<String, Integer> grades) {
		this.grades = grades;
	}

	public Student(String studentId, Map<String, Integer> grades) {
		super();
		this.studentId = studentId;
		this.grades = grades;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", grades=" + grades + "]";
	}
	   
	public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
	    

}
