package spring.q9;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Bean life cycle demonstration
 */
public class LifeCycle implements BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    private String name;

    public LifeCycle() {
        System.out.println("The first step: to instantiate class");
    }


    public void setName(String name) {
        System.out.println("Step Two: Set Properties");
        this.name = name;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Step 3: Set the name of the bean that is spring container" +
                "Name, which is the id value"+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Step Four: Understanding Plant Information ApplicationContext");
    }

    // (where you can join aop) method performed before the fifth step performs initialization


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Step Six: method of execution after property settings");
    }

    public void test(){
        System.out.println("Step Seven: perform the initialization method to configure their own");
    }

    // eighth step method performed after performing initialization (here can join AOP)
    public void run(){
        System.out.println("Step 9: execute its business methods.");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Step 10: Disposal method of execution spring");
    }

    public void destory(){
        System.out.println("Step Eleven: destruction methods to perform their own configuration.");
    }


}

