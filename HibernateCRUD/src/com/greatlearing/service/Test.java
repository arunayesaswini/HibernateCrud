package com.greatlearing.service;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) 
	{
			System.out.println("Connecting to database");
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			System.out.println("created");
		
	}
	
	

}
