package spring.q5.Inject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppRunner {

    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }

    @Bean
    public Greeter greeter() {
        return new Greeter();
    }

    public static void main(String... strings) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        Greeter greeter = context.getBean(Greeter.class);
        greeter.showGreeting("Injection used");
    }
}
