package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testArrays() {
		
		int[] a = new int[] {2,5,8,1,3};
		
		DemoApplication da = new DemoApplication();
		String actuals = da.sortedArray(a);
		String expecteds = "[1, 2, 3, 5, 8]";
			
		assertEquals(expecteds, actuals);
		
		
	}

}
