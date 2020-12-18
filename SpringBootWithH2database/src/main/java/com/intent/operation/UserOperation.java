package com.intent.operation;

import com.intent.Response.Response;
import com.intent.view.UserView;

public interface UserOperation {

	
	public Response save(UserView userView);
	public Response getList();
	
}
