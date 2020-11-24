package com.demo.hibernate.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Studentsname {
	private String fname;
	private String midname;
	private String lasname;
	
	public Studentsname() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Studentsname(String fname, String midname, String lasname) {
		super();
		this.fname = fname;
		this.midname = midname;
		this.lasname = lasname;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMidname() {
		return midname;
	}
	public void setMidname(String midname) {
		this.midname = midname;
	}
	public String getLasname() {
		return lasname;
	}
	public void setLasname(String lasname) {
		this.lasname = lasname;
	}
	@Override
	public String toString() {
		return "Studentsname [fname=" + fname + ", midname=" + midname + ", lasname=" + lasname + "]";
	}
	

}
