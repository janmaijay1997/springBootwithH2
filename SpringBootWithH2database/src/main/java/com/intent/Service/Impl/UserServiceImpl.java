package com.intent.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intent.Repository.UserRepository;
import com.intent.Service.UserService;
import com.intent.model.User;

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

	@Override
	public List<User> listUser() {
		
		
		return userRepo.findAll();
	}

}
