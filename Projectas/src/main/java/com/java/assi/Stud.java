package com.java.assi;

import java.util.List;

public class Stud {
    private String studentId;
    private String name;
    private List<String> courses;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public Stud(String studentId, String name, List<String> courses) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.courses = courses;
	}
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stud [studentId=" + studentId + ", name=" + name + ", courses=" + courses + "]";
	}
    
    

}
