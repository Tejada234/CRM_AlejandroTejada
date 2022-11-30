# CRM_AlejandroTejada

Hola, este readme lo voy a usar como log y hare otro archivo aparte con documentacion (documents.md)

Version 0.1
    - Version base del proyecto
    - Spring, librerias usadas:
        · DevTools
        · SpringWeb

Version 0.2
    - Comienzo con los test
    - Creada una clase Controller
        · Funcion retrieveAllUsers. Te devuelve todos los usuarios en la lista.
        · Funcion newUser. Usando un metodo post crea un usuario nuevo.
    - Creada una clase userController
        · Funcion getAllUsers. Te devuelve el array de usuarios.
        · Funcion createUserOportunidad. Te devuelve un usuario nuevo.
    - Creada una clase UserGenerator
        · Funcion getNewUser. Te genera un objeto usuario con parametros aleatorios
    - Creado el objeto usuario
        · Atributos:
            nombre,
            apellido,
            empresa,
            mensaje,
            numeroTelefono,
            oportunidad,
            cliente.
    - Implementado el primer test al Array de usuarios, comprueba que el array no este vacio
        · Clase CrmAlejandroTejadaApplicationTests linea 14 funcion usersNotNull.
        · Si no hay ningun usuario el test no pasa, si hay algun usuario, pasa

