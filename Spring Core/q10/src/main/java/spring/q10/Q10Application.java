package spring.q10;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

	@Configuration
	public class Q10Application {

		@Bean
		@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
		public MyPrototypeBean prototypeBean() {
			return new MyPrototypeBean();
		}

		@Bean
		public MySingletonBean singletonBean() {
			return new MySingletonBean();
		}

		public static void main(String[] args) throws InterruptedException {
			AnnotationConfigApplicationContext context =
					new AnnotationConfigApplicationContext(Q10Application.class);
			MySingletonBean bean = context.getBean(MySingletonBean.class);
			bean.showMessage();
			Thread.sleep(1000);

			bean = context.getBean(MySingletonBean.class);
			bean.showMessage();


			/*Injecting ApplicationContext, couples the application code to Spring API. Secondly,
					it does not follow the Inversion of Control principle as we are not letting Spring
			to inject the dependencies but we are asking the container to give us the dependencies.
					In some situation this capability might be useful, e.g.
					some bean taking care of some sort of integration to some other framework etc.
					However, in general we should avoid this approach for fixing narrower scoped bean injection problem.*/

		}
	}

