package com.myspring.myspring.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyspringScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(MyspringScopeApplication.class);




	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml")) {


			xml_personDAO personDAOBean = classPathXmlApplicationContext.getBean(xml_personDAO.class);

			xml_personDAO personDAOBean2 = classPathXmlApplicationContext.getBean(xml_personDAO.class);

			xml_personDAO personDAOBean3 = classPathXmlApplicationContext.getBean(xml_personDAO.class);


			logger.info("{}", personDAOBean);
			logger.info("{}", personDAOBean.getJdbcConnection());
			logger.info("{}", personDAOBean2);
			logger.info("{}", personDAOBean2.getJdbcConnection());
			logger.info("{}", personDAOBean3);
			logger.info("{}", personDAOBean3.getJdbcConnection());


			logger.info("beans loaded ->{}", (Object) classPathXmlApplicationContext.getBeanDefinitionNames());

		}
	}
}