package com.java.assi;

import java.util.*;

public class StudentEnroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Python");
		courses.add("C++");
		
		Stud stud=new Stud("S001","Alice",courses);
		
		System.out.println("Student Information");
		System.out.println("Student Id:"+stud.getStudentId());
		System.out.println("Student Name:"+stud.getName());
		System.out.println("Select Course:"+stud.getCourses());



	}

}
