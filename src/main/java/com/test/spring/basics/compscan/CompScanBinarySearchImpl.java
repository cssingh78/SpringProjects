package com.test.spring.basics.compscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.test.spring.basics.firstapp.SortInterface;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CompScanBinarySearchImpl {
	Logger logger = LoggerFactory.getLogger(CompScanBinarySearchImpl.class);
	@Autowired
	// @Qualifier("quick")
	// @Qualifier("bubble")
	@Qualifier("csquick")
	//@Qualifier("cdibubble")
	SortInterface sorter;

	public int binarySearch(int[] nums) {
		return sorter.sort(nums)[sorter.sort(nums).length - 1];
	}

}