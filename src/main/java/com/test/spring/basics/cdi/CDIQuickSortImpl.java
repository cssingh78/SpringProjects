package com.test.spring.basics.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.test.spring.basics.firstapp.SortInterface;

@Component
@Qualifier("cdiquick")
@Primary
public class CDIQuickSortImpl implements SortInterface {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public int[] sort(int[] nums) {
		// System.out.println("CompScanQuickSortImpl -> sort() called");
		logger.debug("sort() method called");
		return new int[] { 11, 22, 33, 44, 55 };
	}

}