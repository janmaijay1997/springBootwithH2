package com.intent.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intent.Service.UserService;
import com.intent.main.Repository.UserRepository;
import com.intent.main.model.User;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepo=userRepository;
	}
	
	@Override
	public User save(User user) {
		 user=userRepo.save(user);
		return user;
	}

}
