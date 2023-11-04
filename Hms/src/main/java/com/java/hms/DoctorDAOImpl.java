package com.java.hms;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.hms.SessionHelper;


public class DoctorDAOImpl {
	SessionFactory sf;
	Session session;
	
	
	public List showDoctorDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Doctor.class);
		List<Doctor> doctorList = criteria.list();
		return doctorList;
	}

}
