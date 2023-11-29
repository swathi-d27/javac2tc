package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class first {

	
	@Autowired
	private ProductRepository rep;
	
	@Test
	@DisplayName("Find all test")
	public void testall() {
		
		List<Product> list=rep.findAll();	
		assertThat(list).size().isGreaterThan(0);
	}

}