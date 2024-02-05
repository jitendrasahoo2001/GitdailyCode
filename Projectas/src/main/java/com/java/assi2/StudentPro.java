//package com.java.assi2;
//
//import java.util.*;
//
//public class StudentPro {
//	 public static void main(String[] args) {
//	        Map<String, studentDAO> gradebook = new HashMap<>();
//
//	        Student student1 = new Student("S001");
//	        student1.setGrades(Map.of("Math", 85, "Science", 90, "English", 78, "History", 92));
//
//	        Student student2 = new Student("S002");
//	        student2.setGrades(Map.of("Math", 75, "Science", 88, "English", 95, "History", 80));
//
//	        gradebook.put(student1.getStudentId(), new StudentGradeOperationsImpl(student1));
//	        gradebook.put(student2.getStudentId(), new StudentGradeOperationsImpl(student2));
//
//	        for (Map.Entry<String, GradeOperations> entry : gradebook.entrySet()) {
//	            String studentId = entry.getKey();
//	            GradeOperations gradeOperations = entry.getValue();
//
//	            System.out.println("Student ID: " + studentId);
//	            System.out.println("Grades: " + student1.getGrades());
//	            System.out.println("Average Grade: " + gradeOperations.calculateAverageGrade());
//	            System.out.println("-----------------------------");
//	        }
//	    }
//
//}
