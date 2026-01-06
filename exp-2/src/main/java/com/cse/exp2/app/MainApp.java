package com.cse.exp2.app;

import com.cse.exp2.dao.ProductDAO;
import com.cse.exp2.model.Product;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        // INSERT
        dao.addProduct(new Product("Laptop", "Gaming Laptop", 65000, 5));
        dao.addProduct(new Product("Mobile", "Android Phone", 20000, 10));

        // RETRIEVE
        Product p = dao.getProduct(1);
        if (p != null)
            System.out.println(p.getName() + " " + p.getPrice());

        // UPDATE
        dao.updateProduct(1, 70000, 4);

        // DELETE
        dao.deleteProduct(2);

        System.out.println("CRUD Operations Completed");
    }
}
