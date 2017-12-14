package com.noah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@ServletComponentScan
//Don't forget the @EnableCaching, or the cache will not be available  
@EnableCaching
public class App {

	public static void main(String [] args){
		SpringApplication.run(App.class, args);
	}
	
}
