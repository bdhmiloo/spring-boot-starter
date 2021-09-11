package com.bdhmiloo.springbootstarter.base;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public abstract class BaseTest {
	
    @Autowired
    MockMvc mockMvc;
	
	protected void setUp() {
		
	}

}
