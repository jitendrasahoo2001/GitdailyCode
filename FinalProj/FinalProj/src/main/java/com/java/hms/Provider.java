package com.java.hms;

import java.io.Serializable;
import java.util.Date;

public class Provider implements Serializable {
	    private String providerId;
	    private String firstName;
	    private String lastName;
	    private Date dateOfBirth;
	    private String email;
	    private String licenseNumber;
	    private String qualification;
	    private String username;
	    private String status;
	    private String phoneNo;
	    private Gender gender;
	    private String speciality;
	    private String address;
	    private String isActive;

	    // Constructor, getters, and setters

	    public Provider() {
	        // Default constructor
	    }

	    public Provider(String providerId, String firstName, String lastName, Date dateOfBirth, String email, String licenseNumber, String qualification, String username, String status, String phoneNo, Gender gender, String speciality, String address, String isActive) {
	        this.providerId = providerId;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dateOfBirth = dateOfBirth;
	        this.email = email;
	        this.licenseNumber = licenseNumber;
	        this.qualification = qualification;
	        this.username = username;
	        this.status = status;
	        this.phoneNo = phoneNo;
	        this.gender = gender;
	        this.speciality = speciality;
	        this.address = address;
	        this.isActive = isActive;
	    }

	    public String getProviderId() {
	        return providerId;
	    }

	    public void setProviderId(String providerId) {
	        this.providerId = providerId;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public Date getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(Date dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getLicenseNumber() {
	        return licenseNumber;
	    }

	    public void setLicenseNumber(String licenseNumber) {
	        this.licenseNumber = licenseNumber;
	    }

	    public String getQualification() {
	        return qualification;
	    }

	    public void setQualification(String qualification) {
	        this.qualification = qualification;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public String getPhoneNo() {
	        return phoneNo;
	    }

	    public void setPhoneNo(String phoneNo) {
	        this.phoneNo = phoneNo;
	    }

	    public Gender getGender() {
	        return gender;
	    }

	    public void setGender(Gender gender) {
	        this.gender = gender;
	    }

	    public String getSpeciality() {
	        return speciality;
	    }

	    public void setSpeciality(String speciality) {
	        this.speciality = speciality;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getIsActive() {
	        return isActive;
	    }

	    public void setIsActive(String isActive) {
	        this.isActive = isActive;
	    }

		@Override
		public String toString() {
			return "Provider [providerId=" + providerId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", licenseNumber=" + licenseNumber
					+ ", qualification=" + qualification + ", username=" + username + ", status=" + status
					+ ", phoneNo=" + phoneNo + ", gender=" + gender + ", speciality=" + speciality + ", address="
					+ address + ", isActive=" + isActive + "]";
		}
	    
	    
	}

	// Enum for gender
	enum Gender {
	    MALE, FEMALE
	}



