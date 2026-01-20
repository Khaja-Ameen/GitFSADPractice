package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.config.Appconfig;
import com.klu.model.CourseRegistration;

public class MainApp {
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		CourseRegistration cr =(CourseRegistration)context.getBean(CourseRegistration.class);
		cr.display();
	}

}
