package com.test.spring.basics.firstapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("bubble")
public class BubbleSortImpl implements SortInterface {
	public int[] sort(int[] nums) {
		System.out.println("BubbleSortImpl -> sort() called");
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
