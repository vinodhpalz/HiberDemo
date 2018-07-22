package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SupplierDAO {
	private Transaction trans;
	private Session sess;
	private boolean b = true;
	public SupplierDAO()
	{
		DBConfig db = new DBConfig();
		sess = db.getSession();
		trans = sess.beginTransaction();
	
	}
	public boolean insertSupplier(Supplier s)
	{
		try {
			
			sess.save(s);
			trans.commit();		
			
		}catch(Exception e) {
			e.printStackTrace();
			trans.rollback();
			b = false;
		}
		return b;
	}
	
}
