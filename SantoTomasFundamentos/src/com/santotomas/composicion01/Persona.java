package com.santotomas.composicion01;

public class Persona {

	private String nombre;
	private Direccion direccion;
	
	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion=new Direccion(direccion);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}