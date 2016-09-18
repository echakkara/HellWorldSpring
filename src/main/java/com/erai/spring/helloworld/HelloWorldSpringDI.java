package com.erai.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		// Initialize Spring ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		("META-INF/app-context.xml");
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();

	}

}
