package com.krushnn.demo.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.NumberFormat;

public class User {
	@NotEmpty(message = "Please Enter Your Name")
	private String uname;
	
	@NotEmpty(message = "Please Enter Your Password")
	private String pass;
	
	@Email(message = "Please Enter Your Valid Email")
	private String email;
	
	@NotEmpty(message = "Please Enter Your Phone Number")
	@NumberFormat()
	private String phoneNo;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", pass=" + pass + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}
	
	

}
