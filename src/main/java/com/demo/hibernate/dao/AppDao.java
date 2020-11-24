package com.demo.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.demo.hibernate.entity.Students;

public class AppDao {

	private Session getSession() {
		Configuration con =new Configuration().configure().addAnnotatedClass(Students.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf= con.buildSessionFactory(reg);
		Session session=sf.openSession();
		return session;

	}


	public int insertStudents(Students donbosco) {
		Session session = getSession();
		Transaction tx =  session.beginTransaction();
		session.save(donbosco);
		tx.commit();
		session.clear();
		return donbosco.getRollnum();

	}
	
	public Object getAllStudents(){
		Session session = getSession();
		Transaction tx =  session.beginTransaction();
		Object donbosco= (Students) session.get(Students.class,session);
		return donbosco;
	}

}
