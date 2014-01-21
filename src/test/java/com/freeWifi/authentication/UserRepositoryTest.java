package com.freeWifi.authentication;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.freeWifi.entities.User;
import com.freeWifi.repositories.UserRepository;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;
	
	@Test
	public void test() {
		User user = new User();
		user.setName("Mebin");
		userRepository.save(user);
		assertNotNull(user);
	}

}