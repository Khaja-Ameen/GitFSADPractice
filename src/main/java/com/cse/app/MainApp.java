package com.cse.app;

import com.cse.dao.ProductDAO;
import com.cse.entity.Product;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        // INSERT
        dao.addProduct(new Product("Laptop", "Gaming Laptop", 75000, 5));
        dao.addProduct(new Product("Mobile", "Android Phone", 25000, 10));

        // READ
        Product p = dao.getProduct(1);
        System.out.println(p.getName() + " " + p.getPrice());

        // UPDATE
        dao.updateProduct(1, 72000, 6);

        // DELETE
        dao.deleteProduct(2);

        System.out.println("CRUD Operations Completed");
    }
}
