package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConfig {
	Configuration cfg;
	SessionFactory sf;
	public DBConfig()
	{
		cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
	}
	public Session getSession()
	{	
		Session sess = sf.openSession();
		return sess;
	}
}
