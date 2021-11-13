package com.containers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.HelloWorld;
import com.config.Application;

public class HelloWorldSpring5Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

		HelloWorld h = context.getBean(HelloWorld.class);
		h.setMsg("Welcome to Spring5 World");
		System.out.println(h.getMsg());
		context.close();
	}

}
