package com.freeWifi.service;

import com.freeWifi.entities.User;

public interface UserService {
	public User getUserData(final String userID, final String authToken);
	public void saveUserData(User user);
	public void getAndSaveUserData(final String userID, final String authToken);
}
