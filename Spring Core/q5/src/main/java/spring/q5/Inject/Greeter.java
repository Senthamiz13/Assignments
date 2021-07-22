package spring.q5.Inject;


import javax.inject.Inject;

public class Greeter {
    @Inject
    private GreetingService greetingService;

    public void showGreeting(String name){
        System.out.println(greetingService.getGreeting(name));
    }
}