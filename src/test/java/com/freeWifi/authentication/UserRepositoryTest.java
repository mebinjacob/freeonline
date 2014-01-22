package com.freeWifi.authentication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.freeWifi.repositories.UserRepository;
import com.freeWifi.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;
	
	@Test
	public void test() {
//		User user = new User();
//		user.setName("Mebin");
		//userService.getAndSaveUserData("me", "CAACEdEose0cBANrR2OQd8rT1MbfdfNHycF0hxVMSHDIRfdaagbGjglQc7IzBZCCumKzIrSMTxXmQ2o5t0wWoxZAv9lfcRojCMOGrIxXoHKDZBaR4HltXZBGEYRRQ1z5tZBt0PXeC5TM9A7yGjuCPNT5WKTHtnsOZBSXbate2mXyrpAD7nrRb6eCvqX610MMV8ZCpKE5YqRqZBgZDZD");
//		userRepository.save(user);
//		assertNotNull(user);
	}

}