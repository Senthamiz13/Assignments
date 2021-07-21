package springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q1Application {
	public static void main(String[] args) {

		// setting application context
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansConstructor.xml");

		//getting bean and assigning it to customer
		Customer customer =(Customer)context.getBean("obj");
		//using method display.info
		customer.displayInfo();
	}
}
