package com.java.hms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PatientDAOImpl {
	SessionFactory sf;
	Session session;

	
	public List<Patient> showPatientDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Patient.class);
		List<Patient> patientList = criteria.list();
		return patientList;
	}
	
	public String addCustomerDao(Patient patient) {
		sf = SessionHelper.getConnection();
		patient = (Patient) sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(patient);
		trans.commit();
	
		
		return "PatientShow.jsp?faces-redirect=true";
	}


}
