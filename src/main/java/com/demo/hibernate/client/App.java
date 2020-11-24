package com.demo.hibernate.client;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.demo.hibernate.entity.Students;
import com.demo.hibernate.entity.Studentsname;
import com.demo.hibernate.service.AppService;


public class App 
{
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Plesae Enter First Name");
    	String fname = sc.nextLine();
    	System.out.println("Plesae Enter Middle Name");
    	String mname = sc.nextLine();
    	System.out.println("Plesae Enter last Name");
    	String lname = sc.nextLine();
    	System.out.println("Plesae Enter Marks");
    	int marks = sc.nextInt();

    	AppService appService = new AppService();
    	
    	int id = appService.insertStudent(fname, mname, lname,marks);
    	System.out.println("Values inserted sucessfully With id : "+id);
    	
    }
    
    
    
}
