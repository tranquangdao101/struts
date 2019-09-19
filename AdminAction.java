package com.action;


import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

import com.models.Admin;
public class AdminAction extends ActionSupport {

	private int id;
	private String username;
	private String password;
	private List<Admin> list;
	
	
	
	public List<Admin> getList() {
		return list;
	}
	public void setList(List<Admin> list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String execute() throws Exception {
		
		Admin admin = new  Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		
		if(admin.isValidUser()) {
			return SUCCESS;
		}
		else {
			
			addFieldError("username","username or password doesnot match");
			addFieldError("password","username or password doesnot match");
			return INPUT;
		}
		
	}
	
	public String getUsers() {
		
		Admin user =  new  Admin();
		this.list = user.getUsers();
		return SUCCESS;
	}
	
	@Override
	public void addFieldError(String fieldName, String errorMessage) {
		
		super.addFieldError(fieldName, errorMessage);
	}

	
}
