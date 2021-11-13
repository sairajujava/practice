package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.HelloWorld;

@Configuration
public class Application {
	
	@Bean
	public HelloWorld getHello(){
		
		return new HelloWorld();
		
	}

}
