package com.test.spring.basics.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.test.spring.basics.firstapp.SortInterface;

@Component
@Qualifier ("cdibubble")
public class CDIBubbleSortImpl implements SortInterface {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public int[] sort(int[] nums) {
		//System.out.println("CompScanBubbleSortImpl -> sort() called");
		logger.debug("sort() called");
		return new int[] { 1, 2, 3, 4, 5 };
	}
	
	//Called after bean is instantiated by Spring framework
	@PostConstruct
	public void postConstruct(){
		logger.debug("postConstruct() called");		
	}

	//Called just before the bean is destroyed by Spring Framework
	@PreDestroy
	public void preDestroy(){
		logger.debug("preDestroy() called");		
	}

}
