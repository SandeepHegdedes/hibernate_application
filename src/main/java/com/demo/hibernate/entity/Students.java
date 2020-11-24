package com.demo.hibernate.entity;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)    
	private int rollnum;
	@Column(name="Studentsname")
	private Studentsname name;
	@Column(name="Studentsmarks")
	private int marks;		
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students( Studentsname name, int marks) {
		super();		
		this.name = name;
		this.marks = marks;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	
	public Studentsname getName() {
		return name;
	}
	public void setName(Studentsname name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [rollnum=" + rollnum + ", name=" + name + ", marks=" + marks + "]";
	}
	

}

