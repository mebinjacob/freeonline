package com.freeWifi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.freeWifi.entities.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String checkIfAuthenticated() {
		
		/*Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		*/
		logger.info("Reached inside the controller!!!");
//		FacebookClient facebookClient = new DefaultFacebookClient("CAACEdEose0cBANrR2OQd8rT1MbfdfNHycF0hxVMSHDIRfdaagbGjglQc7IzBZCCumKzIrSMTxXmQ2o5t0wWoxZAv9lfcRojCMOGrIxXoHKDZBaR4HltXZBGEYRRQ1z5tZBt0PXeC5TM9A7yGjuCPNT5WKTHtnsOZBSXbate2mXyrpAD7nrRb6eCvqX610MMV8ZCpKE5YqRqZBgZDZD");
//		facebookClient.fetchObject("me", User.class);

//		return "home";
		return "login";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.GET)
	public void saveData(@RequestBody String data){
		logger.info("The data received is :- " + data);
	}
	
}
