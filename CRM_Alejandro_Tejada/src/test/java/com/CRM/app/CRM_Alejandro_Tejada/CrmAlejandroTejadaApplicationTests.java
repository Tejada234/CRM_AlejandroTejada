package com.CRM.app.CRM_Alejandro_Tejada;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.CRM.app.CRM_Alejandro_Tejada.controller.userController;

@SpringBootTest
class CrmAlejandroTejadaApplicationTests {

	@Test
	void getUsersNotNull() {
		
		userController control = new userController();
		//control.createUserOportunidad(); // CREO UN USUARIO PARA QUE TENGA DATOS CON LOS QUE PRACTICAR
		
		boolean isNull = control.getAllUsers().isEmpty();
		
		assertEquals(isNull, false); // VERDE HAY USUARIOS, ROJO NO HAY USUARIOS
	}

}
