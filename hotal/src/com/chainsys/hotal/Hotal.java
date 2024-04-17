package com.chainsys.hotal;

public class Hotal {

	int id;
	String hotalName;
	String location;
	long phoneNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotalName() {
		return hotalName;
	}
	public void setHotalName(String hotalName) {
		this.hotalName = hotalName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Hotal(int id, String hotalName, String location, long phoneNumber) {
		this.id = id;
		this.hotalName = hotalName;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}
	public Hotal() {
		
	}
	@Override
	public String toString() {
		return "Hotal [id=" + id + ", hotalName=" + hotalName + ", location=" + location + ", phoneNumber="
				+ phoneNumber + "]";
	}

}
