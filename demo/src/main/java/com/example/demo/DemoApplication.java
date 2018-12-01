package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	public String sortedArray(int[] array) {
		
		
		
		
		for (int i=0; i<array.length-1;i++) {
			
			for(int j=1; j<array.length - i; j++) {
				if(array[j-1] > array[j]) {
				
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				
				}
				
			}
			
		}
		
		//System.out.println(Arrays.toString(array));    
		
		
		
		return Arrays.toString(array);
		
	}
}
