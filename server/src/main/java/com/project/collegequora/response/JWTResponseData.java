package com.project.collegequora.response;

public class JWTResponseData {
    private boolean status;
	private String token;
	private String msg;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	private Object data;
	
	public JWTResponseData(boolean status, String token, String msg,Object data) {
		super();
		this.status = status;
		this.token = token;
		this.msg = msg;
		this.data=data;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
