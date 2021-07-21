package spring.q3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Q3Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

		BankAccountController obj1 = applicationContext.getBean(BankAccountController.class);
		double result1 = obj1.withdraw(12548,451);
		System.out.println(result1);

		BankAccountRepositoryImpl obj2 = applicationContext.getBean(BankAccountRepositoryImpl.class);
		double result2 = obj2.getBalance(12688);
		System.out.println(result2);

		BankAccountServiceImpl obj3 = applicationContext.getBean(BankAccountServiceImpl.class);
		boolean result3 = obj3.fundTransfer(12688,54654,64694);
		System.out.println(result3);

	}

}
