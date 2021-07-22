package spring.newq8.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MyspringApplication {

	public static void main(String[] args) {
/*
		ApplicationContext myapplicationcontext = SpringApplication.run(MyspringApplication.class, args);
		search searchbean = myapplicationcontext.getBean(search.class);
		int result = searchbean.binarysearch(new int[]{1, 2, 3,}, 3);
		System.out.println(result);

		*/
		ConfigurableApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"Beans.xml"});

		search searchbean = context.getBean(search.class);

		System.out.println(searchbean);

		context.close();
	}

}