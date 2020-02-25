package com.user.classs;

public class User {
	String password;
	String admin;
	public User(String password,String admin){
		this.password=password;
		this.admin=admin;
	}

	public String toString(){
		return "["+admin+" , "+password+"]";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
