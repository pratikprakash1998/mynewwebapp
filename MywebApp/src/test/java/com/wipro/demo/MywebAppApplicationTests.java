package com.wipro.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MywebAppApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertEquals("2","2");
	}

}
