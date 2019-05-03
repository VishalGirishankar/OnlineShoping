package com.aspire.onlineshoping.manager;

import java.util.List;

import com.aspire.onlineshoping.models.dao.UserDao;
import com.aspire.onlineshoping.models.dto.LoginReponse;
import com.aspire.onlineshoping.models.dto.User;

public class LoginManager {
	@SuppressWarnings("unlikely-arg-type")
	public LoginReponse validateUser(User user) {
		LoginReponse loginResponse = new LoginReponse();
		loginResponse.setLoginStatus("Login Failure");
		UserDao userDao = new UserDao();
		List<User> userList = userDao.getAllUsers();
		for (User userDetails:userList) {
			System.out.println(userDetails.getName());
			if (userDetails.equals(user.getName()) && userDetails.equals(user.getPassword())) {
				loginResponse.setLoginStatus("Login Success");
				System.out.println(user.getName());
				break;
			}
		}
		return loginResponse;
	}
}
