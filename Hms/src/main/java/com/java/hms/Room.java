package com.java.hms;

public class Room {
	private String roomNo;
    private String roomType;
    private Status status;
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Room(String roomNo, String roomType, Status status) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", roomType=" + roomType + ", status=" + status + "]";
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
