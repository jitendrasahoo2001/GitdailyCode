package com.java.hms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RoomDAOImpl {
	SessionFactory sf;
	Session session;
	
	
	public List showRoomDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Room.class);
		List<Room> roomList = criteria.list();
		return roomList;
	}

}
