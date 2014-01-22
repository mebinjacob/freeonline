package com.freeWifi.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.freeWifi.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	UserService userService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String checkIfAuthenticated() {
		
		logger.info("Reached inside the controller!!!");
//		FacebookClient facebookClient = new DefaultFacebookClient("CAACEdEose0cBANrR2OQd8rT1MbfdfNHycF0hxVMSHDIRfdaagbGjglQc7IzBZCCumKzIrSMTxXmQ2o5t0wWoxZAv9lfcRojCMOGrIxXoHKDZBaR4HltXZBGEYRRQ1z5tZBt0PXeC5TM9A7yGjuCPNT5WKTHtnsOZBSXbate2mXyrpAD7nrRb6eCvqX610MMV8ZCpKE5YqRqZBgZDZD");
//		facebookClient.fetchObject("me", User.class);

//		return "home";
		return "login";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public void saveData(HttpServletRequest request){
		
		String userID = request.getParameter("userID");
		String authToken = request.getParameter("authToken");
		userService.getAndSaveUserData(userID, authToken);
		logger.info("The user id is : " + userID);
		logger.info("The auth token is " + authToken);
	
	}
	
}
