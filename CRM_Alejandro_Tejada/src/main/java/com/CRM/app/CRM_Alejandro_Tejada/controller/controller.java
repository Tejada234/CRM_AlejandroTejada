package com.CRM.app.CRM_Alejandro_Tejada.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	private userController service;

	public controller(userController service) {
		this.service = service;
	}

	@GetMapping(path = "/usuario")
	public List<usuario> retrieveAllUsers() {

		return service.getAllUsers();
	}

	@PostMapping(path = "/usuario/create")
	public void newUser() {
		service.createUserOportunidad();
	}

}
