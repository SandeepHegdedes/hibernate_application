package com.demo.hibernate.service;

import java.util.List;

import com.demo.hibernate.dao.AppDao;
import com.demo.hibernate.entity.Students;
import com.demo.hibernate.entity.Studentsname;

public class AppService {

	public int insertStudent(String fname, String mname, String lname,int marks) {
		
		Studentsname stn = new Studentsname(fname,mname,lname);
		Students donbosco = new Students(stn,marks);
		AppDao appDao = new AppDao();
		return appDao.insertStudents(donbosco);		
	}

	public List<Students> getAllStudents() {
		return null;
		
	}
}
