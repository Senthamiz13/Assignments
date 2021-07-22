package spring.q5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Q5Application {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
		Employee emp = ac.getBean(Employee.class);
		System.out.println(emp.toString());
	}

}
