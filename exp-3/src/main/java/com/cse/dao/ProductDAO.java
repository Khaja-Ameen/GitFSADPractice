package com.cse.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.cse.config.HibernateUtil;
import com.cse.entity.Product;

public class ProductDAO {

    public void addProduct(Product p) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        s.save(p);
        tx.commit();
        s.close();
    }
}
