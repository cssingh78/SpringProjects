package com.test.spring.basics.props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesDemo {
	
	@Value("${db.service.url}") //Read value from external properties file
	private String dbUrl;

	public String getDbUrl() {
		return dbUrl;
	}

}
