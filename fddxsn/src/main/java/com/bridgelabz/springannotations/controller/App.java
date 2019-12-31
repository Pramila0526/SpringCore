package com.bridgelabz.springannotations.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelabz.springannotations.Mumbai;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		// Mumbai mumbai = new Mumbai();
		// mumbai.config(); But this is not Dependency Injection
		// We Should Able to inject this object so we can ask our factory as below
		
		ApplicationContext factory = new AnnotationConfigApplicationContext();
		
		// Here we are asking factory to give you the object
		Mumbai mumbai = factory.getBean(Mumbai.class);
		mumbai.config();

	}
}
