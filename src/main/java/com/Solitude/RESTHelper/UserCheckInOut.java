package com.Solitude.RESTHelper;

import lombok.Data;

@Data
public class UserCheckInOut {
	private Long userID;
	private String email;

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
