package com.resume.spring.boot.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Detail {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     public long id;
	@Override
	public String toString() {
		return "Detail [id=" + id + ", mobileNumber=" + mobileNumber + ", address=" + address + ", email=" + email
				+ "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detail(long id, String mobileNumber, String address, String email) {
		super();
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
	}
	public String mobileNumber;
  public  String address;
  public	String email;
}
