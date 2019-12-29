package com.neelima.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5stepsApplication {

	public static void main(String[] args) {
		
		BinarySearchimpl binarySearch = new BinarySearchimpl();
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		
		System.out.println(result);
		
		SpringApplication.run(SpringIn5stepsApplication.class, args);
	}

}
