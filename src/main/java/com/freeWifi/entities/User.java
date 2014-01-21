package com.freeWifi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POST")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="auto_gen_id")
	private Integer id;

	@Column(name="NAME")
	private String name;
	
	@Column(name = "ATUH_TOKEN")
	private String authToken;
	
	@Column(name = "USER_ID")
	private String userID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

}
