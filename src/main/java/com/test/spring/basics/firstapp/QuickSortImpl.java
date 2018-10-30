package com.test.spring.basics.firstapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("quick")
@Primary
public class QuickSortImpl implements SortInterface {
	public int[] sort(int[] nums) {
		System.out.println("QuickSortImpl -> sort() called");
		return new int[] { 11, 22, 33, 44, 55 };
	}

}
