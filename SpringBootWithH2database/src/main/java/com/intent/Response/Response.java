package com.intent.Response;

public class Response {

	
	private int responseCode;
	private String message;
	private  Object data;
	
	Response(){
		
	}
	
	public Response(int responseCode,String message,Object data){
		this.responseCode=responseCode;
		this.message=message;
		this.data=data;
	}
	
	public Response(int responseCode,String message){
		this.responseCode=responseCode;
		this.message=message;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
