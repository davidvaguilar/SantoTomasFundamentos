package com.santotomas.herencia02;

public class Vehiculo {

	//Atributos private, protected, public 
	protected int ruedas;
	protected String conductor;
	protected String color;
	protected int velocidad;
	protected int posX;
	
	

	public Vehiculo(int ruedas, String conductor, String color, int velocidad, int posX ) {
		this.ruedas = ruedas;
		this.conductor = conductor;
		this.color = color;
		this.velocidad = velocidad;
		this.posX = posX;
	}
	
	//FUNCION PRIVADA
	public int movimiento(int tiempo){
		return tiempo+this.velocidad;
	}
	
	public void mover(int tiempo){
		this.posX=this.posX+movimiento(tiempo);
	}
	
	@Override
	public String toString(){
		return "El vehiculo tiene un conductor llamado: "+this.conductor+" vehiculo color"+this.color;
	}
	
	//SETTERS y GETTERS
	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	
	
	
}
