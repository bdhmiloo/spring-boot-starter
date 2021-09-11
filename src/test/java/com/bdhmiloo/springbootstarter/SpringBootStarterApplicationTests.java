package com.bdhmiloo.springbootstarter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringBootStarterApplicationTests {

	@Test
	void contextLoads() {
		// given

		// when
		SpringBootStarterApplication.main(new String[] {});

		// then
		Mockito.doNothing();
	}

}
