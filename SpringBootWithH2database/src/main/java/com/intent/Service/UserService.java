package com.intent.Service;
import java.util.List;

import com.intent.model.User;

public interface UserService {
	
	public User save(User user);

	public List<User> listUser();
}
