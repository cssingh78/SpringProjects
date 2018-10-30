package com.test.spring.basics.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	@Autowired
	//@Qualifier("quick")
	@Qualifier("bubble")
	SortInterface sorter;

	boolean binarySearch(int[] nums, int findNum) {
		sorter.sort(nums);
		return true;
	}

}