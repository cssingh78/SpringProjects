package com.test.spring.basics.compscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.test.spring.basics.firstapp.SortInterface;

@Component
@Qualifier("csquick")
@Primary
public class CompScanQuickSortImpl implements SortInterface {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public int[] sort(int[] nums) {
		// System.out.println("CompScanQuickSortImpl -> sort() called");
		logger.debug("sort() method called");
		return new int[] { nums.length + 10, nums.length + 11, nums.length + 12, nums.length + 13 };
	}

}