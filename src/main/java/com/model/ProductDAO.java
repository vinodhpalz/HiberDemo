package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductDAO {
	private Transaction trans;
	private Session sess;
	private boolean b = true;
	public boolean insertProduct(Product p)
	{
		try {
			
			DBConfig db = new DBConfig();
			sess = db.getSession();
			trans = sess.beginTransaction();
			sess.save(p);
			trans.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			trans.rollback();
			b = false;
		}
		return b;
	}
}
