package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ProductDAO {
	private Transaction trans;
	private Session sess;
	private boolean b = true;
	public ProductDAO()
	{
		DBConfig db = new DBConfig();
		sess = db.getSession();
		trans = sess.beginTransaction();
	
	}
	public boolean insertProduct(Product p)
	{
		try {
			
			sess.save(p);
			trans.commit();		
			
		}catch(Exception e) {
			e.printStackTrace();
			trans.rollback();
			b = false;
		}
		return b;
	}
	
	public boolean updateProduct(Product p)
	{
		try {
			
			sess.update(p);
			trans.commit();
		
		}catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			b = false;
		}
		return b;
	}
	
	public boolean deleteProduct(Product p)
	{
		try
		{
			sess.delete(p);
			trans.commit();
		}catch(Exception e) {
			e.printStackTrace();
			trans.rollback();
			b = false;
		}
		return b;
	}
	
	
	public List<Product> getProducts()
	{
		Query query = sess.createQuery("from Product");
		List<Product> lp = (List<Product>)query.getResultList();
		return lp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
