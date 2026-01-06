package com.cse.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.cse.config.HibernateUtil;
import com.cse.entity.Product;

public class ProductHQLDAO {

    // Sort by price ASC
    public List<Product> priceAsc() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Product> list =
            s.createQuery("from Product p order by p.price asc", Product.class).list();
        s.close();
        return list;
    }

    // Sort by price DESC
    public List<Product> priceDesc() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Product> list =
            s.createQuery("from Product p order by p.price desc", Product.class).list();
        s.close();
        return list;
    }

    // Sort by quantity (highest first)
    public List<Product> quantityDesc() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Product> list =
            s.createQuery("from Product p order by p.quantity desc", Product.class).list();
        s.close();
        return list;
    }

    // Pagination – first 3
    public List<Product> firstThree() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query<Product> q = s.createQuery("from Product", Product.class);
        q.setFirstResult(0);
        q.setMaxResults(3);
        List<Product> list = q.list();
        s.close();
        return list;
    }

    // Pagination – next 3
    public List<Product> nextThree() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query<Product> q = s.createQuery("from Product", Product.class);
        q.setFirstResult(3);
        q.setMaxResults(3);
        List<Product> list = q.list();
        s.close();
        return list;
    }

    // Count total products
    public Long countAll() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Long c =
            s.createQuery("select count(p) from Product p", Long.class).uniqueResult();
        s.close();
        return c;
    }

    // Count products where quantity > 0
    public Long countAvailable() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Long c =
            s.createQuery(
              "select count(p) from Product p where p.quantity > 0",
              Long.class).uniqueResult();
        s.close();
        return c;
    }

    // Group by description
    public List<Object[]> groupByDescription() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Object[]> list =
            s.createQuery(
              "select p.description, count(p) from Product p group by p.description")
             .list();
        s.close();
        return list;
    }

    // Min & Max price
    public Object[] minMaxPrice() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Object[] o =
            s.createQuery(
              "select min(p.price), max(p.price) from Product p",
              Object[].class).uniqueResult();
        s.close();
        return o;
    }

    // Price range
    public List<Product> priceRange(double min, double max) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Product> list =
            s.createQuery(
              "from Product p where p.price between :a and :b", Product.class)
             .setParameter("a", min)
             .setParameter("b", max)
             .list();
        s.close();
        return list;
    }

    // LIKE queries
    public List<Product> startsWith(String s1) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Product> list =
            s.createQuery(
              "from Product p where p.name like :n", Product.class)
             .setParameter("n", s1 + "%")
             .list();
        s.close();
        return list;
    }

    public List<Product> endsWith(String s1) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Product> list =
            s.createQuery(
              "from Product p where p.name like :n", Product.class)
             .setParameter("n", "%" + s1)
             .list();
        s.close();
        return list;
    }

    public List<Product> contains(String s1) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Product> list =
            s.createQuery(
              "from Product p where p.name like :n", Product.class)
             .setParameter("n", "%" + s1 + "%")
             .list();
        s.close();
        return list;
    }

    public List<Product> exactLength(int len) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Product> list =
            s.createQuery(
              "from Product p where length(p.name)=:l", Product.class)
             .setParameter("l", len)
             .list();
        s.close();
        return list;
    }
}
