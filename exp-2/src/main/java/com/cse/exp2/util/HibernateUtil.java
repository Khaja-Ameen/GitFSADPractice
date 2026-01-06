package com.cse.exp2.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory factory;

    static {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.cse.exp2.model.Product.class)
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
