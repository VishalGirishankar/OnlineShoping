package com.aspire.onlineshoping.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspire.onlineshoping.manager.LoginManager;
import com.aspire.onlineshoping.models.dto.LoginReponse;
import com.aspire.onlineshoping.models.dto.User;

@RestController
@RequestMapping("/login")
public class Controller {
	public LoginReponse login(@RequestBody User user) {
		LoginManager loginManager = new LoginManager();
		return loginManager.validateUser(user);
	}
}
