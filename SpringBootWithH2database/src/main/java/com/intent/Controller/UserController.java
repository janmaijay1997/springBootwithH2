package com.intent.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intent.Response.Response;
import com.intent.operation.UserOperation;
import com.intent.view.UserView;


@RestController
@RequestMapping("/user")
public class UserController {

	private UserOperation userOperation;
	
	@Autowired
	public UserController(UserOperation userOperation) {
		this.userOperation=userOperation;
				
	}
	
	@PostMapping("/save")
	public Response save(@RequestBody UserView userView) {
		return userOperation.save(userView);
	}
	@GetMapping("/list")
	public Response get() {
		return userOperation.getList();
	}
}
