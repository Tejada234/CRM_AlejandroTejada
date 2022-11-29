package com.CRM.app.CRM_Alejandro_Tejada.controller;

import java.util.ArrayList;
import java.util.List;


public class userController {

	
private static List<usuario> users = new ArrayList<>();
	

	static {
		users.add(new usuario(1, "Alex", "Tejada"));
		users.add(new usuario(2, "Pili", "Alegre"));
	}
}
