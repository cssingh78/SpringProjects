package com.test.spring.basics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import com.test.spring.basics.firstapp.SortInterface;

@Named //@Component can be replaced by @Name which is standard annotation as per CDI spec
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CDIBinarySearchImpl {
	Logger logger = LoggerFactory.getLogger(CDIBinarySearchImpl.class);
	@Inject //@Autowired can be replaced by @Inject which is standard annotation as per CDI spec
	//@Qualifier("quick")
	//@Qualifier("bubble")
	@Qualifier("cdiquick")
	SortInterface sorter;

	public boolean binarySearch(int[] nums, int findNum) {
		sorter.sort(nums);
		return true;
	}

}