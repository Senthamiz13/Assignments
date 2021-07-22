package com.myspring.myspring.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyspringApplication {

	public static void main(String[] args) {

		ApplicationContext myapplicationcontext = SpringApplication.run(MyspringApplication.class, args);

		search searchbean = myapplicationcontext.getBean(search.class);

		int result = searchbean.binarysearch(new int[]{1, 2, 3,}, 3);
		System.out.println(result);

	}

}