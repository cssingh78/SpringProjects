package com.test.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.test.spring.basics.props.PropertiesDemo;

@SpringBootApplication
@ComponentScan("com.test.spring.basics.compscan") //Scan specified package and all sub packages
@ComponentScan("com.test.spring.basics.firstapp")
@PropertySource("classpath:apps.properties") //Load external properties file for the app
public class MySpringApplication {

	private static Logger logger = LoggerFactory.getLogger(MySpringApplication.class);

	public static void main(String[] args) {
//		ConfigurableApplicationContext app = SpringApplication.run(MySpringApplication.class, args);
//		CompScanBinarySearchImpl compScanBinarySearchImpl = app.getBean(CompScanBinarySearchImpl.class);
//		CDIBinarySearchImpl cdiBinarySearchImpl = app.getBean(CDIBinarySearchImpl.class);
//		// BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
//		boolean result1 = cdiBinarySearchImpl.binarySearch(null, 5);
//		boolean result2 = compScanBinarySearchImpl.binarySearch(null, 3);
//		logger.debug("{}", result1);
//		logger.debug("{}", result2);
		ConfigurableApplicationContext app = SpringApplication.run(MySpringApplication.class, args);
		PropertiesDemo propertiesDemo = app.getBean(PropertiesDemo.class);
		logger.debug("{}", propertiesDemo.getDbUrl());
	}
}
