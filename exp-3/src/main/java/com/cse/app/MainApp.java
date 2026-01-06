package com.cse.app;

import com.cse.dao.ProductDAO;
import com.cse.dao.ProductHQLDAO;
import com.cse.entity.Product;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();
        ProductHQLDAO hql = new ProductHQLDAO();

        // Add 5–8 products
        dao.addProduct(new Product("Mouse", "Electronics", 800, 50));
        dao.addProduct(new Product("Keyboard", "Electronics", 1500, 30));
        dao.addProduct(new Product("Monitor", "Electronics", 12000, 15));
        dao.addProduct(new Product("Chair", "Furniture", 3500, 20));
        dao.addProduct(new Product("Table", "Furniture", 7000, 10));

        // Test HQL
        hql.priceAsc().forEach(
            p -> System.out.println(p.getName() + " " + p.getPrice())
        );

        System.out.println("Total Products: " + hql.countAll());
    }
}
