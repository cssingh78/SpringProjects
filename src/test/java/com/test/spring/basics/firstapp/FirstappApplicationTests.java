package com.test.spring.basics.firstapp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;

import com.test.spring.basics.MySpringApplication;
import com.test.spring.basics.compscan.CompScanBinarySearchImpl;

//@RunWith(SpringRunner.class) //While using Mockito, SpringContext is not needed so this can be commented
@RunWith(MockitoJUnitRunner.class) //This needs to be added while testing with Mockito
//@SpringBootTest //Commented to use junit in plain Spring project
@ContextConfiguration(classes = MySpringApplication.class)
public class FirstappApplicationTests {

	// @Autowired
	@InjectMocks // With Mockito, annotation changed as mocked dependency needs to be injected
	CompScanBinarySearchImpl compScanBinarySearchImpl;

	@Mock
	SortInterface sortInterface;

	@Test
	public void contextLoads() {

	}

	@Test
	public void testBinarySearchWithThree() {
		when(sortInterface.sort(new int[] { 2, 3, 4 })).thenReturn(new int[] { 13, 14, 15, 16 });
		int actualResult = compScanBinarySearchImpl.binarySearch(new int[] { 2, 3, 4 });
		assertEquals(16, actualResult);

	}

	@Test
	public void testBinarySearchWithFive() {
		when(sortInterface.sort(new int[] { 2, 3, 4, 5, 6 })).thenReturn(new int[] { 15, 16, 17, 19 });
		int actualResult = compScanBinarySearchImpl.binarySearch(new int[] { 2, 3, 4, 5, 6 });
		assertEquals(18, actualResult);

	}

}