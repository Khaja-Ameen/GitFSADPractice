package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class MainApp {
public static void main(String args[]) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Student stu=new Student("SHAIK KHAJA AMEEN");
	session.save(stu);
	tx.commit();
	session.close();
	factory.close();
	System.out.println("Data has been inserted ");
	
}
}
