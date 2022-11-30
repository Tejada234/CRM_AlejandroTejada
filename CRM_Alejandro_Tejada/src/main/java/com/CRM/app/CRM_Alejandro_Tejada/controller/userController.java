package com.CRM.app.CRM_Alejandro_Tejada.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.CRM.app.CRM_Alejandro_Tejada.Generator.UserGenerator;

@Controller
public class userController {

	
private static List<usuario> users = new ArrayList<>();
	
/*
	static {
		users.add(UserGenerator.getNewUser(true));
		users.add(UserGenerator.getNewUser(true));
		users.add(UserGenerator.getNewUser(true));
	}
*/

	public List<usuario> getAllUsers() {
		
		return users;
	}
	
	public void createUserOportunidad() {
		users.add(UserGenerator.getNewUser(true));
		
	}
	
	
}
