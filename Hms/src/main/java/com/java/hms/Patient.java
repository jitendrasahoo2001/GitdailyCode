package com.java.hms;

public class Patient {
	private String pid;
    private String name;
    private int age;
    private int weight;
    private String gender;
    private String address;
    private String phoneNo;
    private String disease;
    private String doctor_id;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	public Patient(String pid, String name, int age, int weight, String gender, String address, String phoneNo,
			String disease, String doctor_id) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
		this.disease = disease;
		this.doctor_id = doctor_id;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", age=" + age + ", weight=" + weight + ", gender=" + gender
				+ ", address=" + address + ", phoneNo=" + phoneNo + ", disease=" + disease + ", doctor_id="
				+ doctor_id + "]";
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
