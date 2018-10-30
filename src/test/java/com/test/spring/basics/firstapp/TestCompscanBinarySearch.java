package com.test.spring.basics.firstapp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.xmlunit.input.WhitespaceNormalizedSource;

import com.test.spring.basics.compscan.CompScanBinarySearchImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestCompscanBinarySearch {

	@Mock
	SortInterface sortInterface;
	
	@InjectMocks
	CompScanBinarySearchImpl compScanBinarySearchImpl;
	
	@Test
	public void test() {
		when(sortInterface.sort(new int[] {11, 22, 44, 55, 33})).thenReturn(new int[] {11, 22, 33, 44, 55});
		System.out.println(sortInterface.sort(new int[] {11, 22, 44, 55, 33}));
	}

}
