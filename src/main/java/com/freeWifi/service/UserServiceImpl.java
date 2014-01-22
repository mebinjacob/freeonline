package com.freeWifi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freeWifi.entities.User;
import com.freeWifi.repositories.UserRepository;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User getUserData(final String userID, final String authToken) {
		
		FacebookClient facebookClient = new DefaultFacebookClient(authToken);
		User fbUser = facebookClient.fetchObject(userID, User.class);
		User user = new User();
		user.setName(fbUser.getName());
		return user;
	
	}

	@Override
	public void saveUserData(final User user) {

		if(null != user){
			userRepository.save(user);
		}
		
	}

	@Override
	public void getAndSaveUserData(final String userID, final String authToken) {

		saveUserData(getUserData(userID, authToken));
		
	}

}
