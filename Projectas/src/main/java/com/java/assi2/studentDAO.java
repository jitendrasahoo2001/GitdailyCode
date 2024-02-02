package com.java.assi2;

import java.util.Map;

public interface studentDAO {
	void setGrades(Map<String, Integer> grades);
    double calculateAverageGrade();

}
