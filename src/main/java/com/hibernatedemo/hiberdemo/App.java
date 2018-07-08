package com.hibernatedemo.hiberdemo;

import com.model.Product;
import com.model.ProductDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductDAO pd = new ProductDAO();
        Product p = new Product();
        p.setPname("Cycle");
        p.setPcost(5000);
        pd.insertProduct(p);
        System.out.println("Product Object Inserted Succefully");
    }
}
