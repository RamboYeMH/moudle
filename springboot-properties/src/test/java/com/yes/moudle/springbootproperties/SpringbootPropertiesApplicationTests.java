package com.yes.moudle.springbootproperties;

import com.yes.moudle.springbootproperties.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootPropertiesApplicationTests
{

	@Autowired
	private Person person;
	@Test
	void contextLoads()
	{
		System.out.println(person);
	}

}
