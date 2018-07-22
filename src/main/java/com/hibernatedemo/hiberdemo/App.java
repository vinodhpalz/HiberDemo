package com.hibernatedemo.hiberdemo;

import java.util.List;

import com.model.Product;
import com.model.ProductDAO;
import com.model.Supplier;
import com.model.SupplierDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	SupplierDAO sd = new SupplierDAO();
    	ProductDAO pd = new ProductDAO();
        Supplier s1 = new Supplier();
       
        Product p1 = new Product();
        p1.setPname("Apple");
        p1.setPcost(3000);
     
        s1.setName("Flipkart");
        
        //s1.setProd(p1); 
        
        p1.setSuppl(s1);
        sd.insertSupplier(s1);
        pd.insertProduct(p1);
        
        
             
             
        System.out.println("Completed");
        
       
    }
}
