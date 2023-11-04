package com.java.hms;

public class Doctor {
	private String drId;
    private String drName;
    private String dept;
	public String getDrId() {
		return drId;
	}
	public void setDrId(String drId) {
		this.drId = drId;
	}
	public String getDrName() {
		return drName;
	}
	public void setDrName(String drName) {
		this.drName = drName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Doctor(String drId, String drName, String dept) {
		super();
		this.drId = drId;
		this.drName = drName;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Doctor [drId=" + drId + ", drName=" + drName + ", dept=" + dept + "]";
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    

}
