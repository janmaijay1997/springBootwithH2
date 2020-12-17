package com.intent.operation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.intent.Response.Response;
import com.intent.Service.UserService;
import com.intent.main.model.User;
import com.intent.operation.UserOperation;
import com.intent.view.UserView;
@Component
@Transactional(propagation = Propagation.REQUIRED)
public class UserOperationImpl implements UserOperation {

	private UserService userService;

	@Autowired
	public UserOperationImpl(UserService userService) {
		this.userService = userService;

	}

	private User toModel(UserView userView) {
		User user = new User();
		if (userView.getAge() > 0) {
			user.setAge(userView.getAge());
		}
		if (!ObjectUtils.isEmpty(userView.getEmailId())) {
			user.setEmailId(userView.getEmailId());
		}
		if (!ObjectUtils.isEmpty(userView.getName())) {
			user.setName(userView.getName());
		}
		return user;
	}

	private UserView toView(User user) {
		UserView userView = new UserView();
		if (user.getAge() > 0) {
			userView.setAge(user.getAge());
		}
		
		
		if (!ObjectUtils.isEmpty(user.getEmailId())) {
			userView.setEmailId(user.getEmailId());
		}
		if (!ObjectUtils.isEmpty(user.getName())) {
			userView.setName(user.getName());
		}
		return userView;
	}

	@Override
	public Response save(UserView userView) {
		User user = toModel(userView);
		return new Response(200, "success", toView(userService.save(user)));
	}

}
