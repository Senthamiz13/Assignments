package spring.q6;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:dbconfig.properties")
public class Q6Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(Q6Application.class);
		ExternalService personDAO = run.getBean(ExternalService.class);
		System.out.println(personDAO.toString());


	}

}