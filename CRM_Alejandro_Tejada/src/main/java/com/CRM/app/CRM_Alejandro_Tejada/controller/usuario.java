package com.CRM.app.CRM_Alejandro_Tejada.controller;

public class usuario {

	private String nombre;
	private String apellido;
	private String empresa;
	private String mensaje;
	private int numeroTelefono;
	private boolean oportunidad;
	private boolean cliente;

	public usuario(String nombre, String apellido, String empresa, String mensaje, int numeroTelefono,
			boolean oportunidad, boolean cliente) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresa = empresa;
		this.mensaje = mensaje;
		this.numeroTelefono = numeroTelefono;
		this.oportunidad = oportunidad;
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public boolean isOportunidad() {
		return oportunidad;
	}

	public void setOportunidad(boolean oportunidad) {
		this.oportunidad = oportunidad;
	}

	public boolean isCliente() {
		return cliente;
	}

	public void setCliente(boolean cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "usuario [nombre=" + nombre + ", apellido=" + apellido + ", empresa=" + empresa + ", mensaje=" + mensaje
				+ ", numeroTelefono=" + numeroTelefono + ", oportunidad=" + oportunidad + ", cliente=" + cliente + "]";
	}

}
