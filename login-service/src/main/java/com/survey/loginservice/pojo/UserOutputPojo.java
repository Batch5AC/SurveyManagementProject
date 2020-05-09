package com.survey.loginservice.pojo;

public class UserOutputPojo {
	private int id;
	private String username;
	private String password;
	public UserOutputPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserOutputPojo(int id, String username, String password, QuestionPojo questioPojo) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.questioPojo = questioPojo;
	}
	@Override
	public String toString() {
		return "UserOutputPojo [id=" + id + ", username=" + username + ", password=" + password + ", questioPojo="
				+ questioPojo + "]";
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
	public QuestionPojo getQuestioPojo() {
		return questioPojo;
	}
	public void setQuestioPojo(QuestionPojo questioPojo) {
		this.questioPojo = questioPojo;
	}
	private QuestionPojo questioPojo;
	
}



