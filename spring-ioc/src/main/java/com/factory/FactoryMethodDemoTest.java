package com.factory;

public class FactoryMethodDemoTest {

	public static void main(String[] args) {
		
		
		FactoryMethodDemo fd = new FactoryMethodDemo();
		
		System.out.println(fd.provideCon("mongo"));

	}

}
