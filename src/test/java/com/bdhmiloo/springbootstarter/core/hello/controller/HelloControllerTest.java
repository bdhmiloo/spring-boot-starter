package com.bdhmiloo.springbootstarter.core.hello.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.bdhmiloo.springbootstarter.base.BaseTest;
import com.bdhmiloo.springbootstarter.core.hello.controller.HelloController;

@WebMvcTest(HelloController.class)
public class HelloControllerTest extends BaseTest {

	@Autowired
	public HelloController helloController;
	
    @BeforeEach
    public void setUp() {
    	super.setUp();
    }

	@Test
	public void test_sayHello_success() {
		// given
		
		
		// when
		String response = helloController.sayHello();
		
		// then
		assertEquals("Hello World", response);
	}
}
