package com.java.assi2;

import java.util.Map;

public class studentDAOImpl implements studentDAO {
	 private Student studentGrade;

	    public studentDAOImpl(Student studentGrade) {
	        this.studentGrade = studentGrade;
	    }

	@Override
	public void setGrades(Map<String, Integer> grades) {
		// TODO Auto-generated method stub
		 studentGrade.setGrades(grades);
		
	}
	

	@Override
	public double calculateAverageGrade() {
		// TODO Auto-generated method stub
		 return studentGrade.calculateAverageGrade();
	}

}
