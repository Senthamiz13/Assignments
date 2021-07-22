package com.myspring.myspring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class MyspringScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(MyspringScopeApplication.class);

	public static void main(String[] args) {

		//search mysearch = new search(new bubblesort());
		//asplication context

		ApplicationContext myapplicationcontext = SpringApplication.run(MyspringScopeApplication.class, args);

		personDAO personDAOBean = myapplicationcontext.getBean(personDAO.class);

		personDAO personDAOBean2 = myapplicationcontext.getBean(personDAO.class);

		personDAO personDAOBean3 = myapplicationcontext.getBean(personDAO.class);


		logger.info("{}",personDAOBean);
		logger.info("{}",personDAOBean.getJdbcConnection());
		logger.info("{}",personDAOBean2);
		logger.info("{}",personDAOBean2.getJdbcConnection());
		logger.info("{}",personDAOBean3);
		logger.info("{}",personDAOBean3.getJdbcConnection());

	}

}