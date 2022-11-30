package com.CRM.app.CRM_Alejandro_Tejada.Generator;

import com.CRM.app.CRM_Alejandro_Tejada.controller.usuario;

public class UserGenerator {
	public static usuario getNewUser(boolean isOportunidad) {
		
		usuario user = new usuario(
				nombre(), 	// NOMBRE
				apellido(), 	// APELLIDO
				empresa(), 	// EMPRESA
				mensaje(), 	// MENSAJE
				(int) (Math.random() * 999999999), 	  // N TELEFONO
				isOportunidad,
				!isOportunidad);
		
		return user;
		
	}
	
	private static String nombre() {
		
		String[] array = {"Alex", "Maria", "Juan", "Sergio", "Pili", "Toni", "Carla", "Raquel", "Dani", "Antonio"};
		
		String nombre = array[(int) (Math.random() * 10)];
		
		return nombre;
	}
	private static String apellido() {
		
		String[] array = {"Tejada", "Blanco", "Diaz", "Perez", "Motos", "Lanjaron", "Sierra", "Medina", "Garcia", "Marti"};
		
		String nombre = array[(int) (Math.random() * 10)];
		
		return nombre;
	}
	private static String empresa() {
		
		String[] array = {"Solera", "BBVA", "Repsol", "Google", "Twitter", "Amstel", "Jabra", "DELL", "Facebook", "Instagram"};
		
		String nombre = array[(int) (Math.random() * 10)];
		
		return nombre;
	}
	private static String mensaje() {
		
		String[] array = {"Quiero un boli", "Quiero un coche", "Quiero una casa", "Quiero compañia", "Quiero una cita", "Quiero comida", "Quiero un extintor", "Quiero una luz", "Quiero un portatil", "Quiero 200 moviles"};
		
		String nombre = array[(int) (Math.random() * 10)];
		
		return nombre;
	}
	
}
