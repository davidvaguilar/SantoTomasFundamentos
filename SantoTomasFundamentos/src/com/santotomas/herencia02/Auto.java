package com.santotomas.herencia02;

public class Auto extends Vehiculo {
	
	private int ventanas;
	private int caballos;
	
	public Auto(int ruedas, String conductor, String color, int velocidad, int posX, int ventanas, int caballos) {
		super(ruedas, conductor, color, velocidad, posX);
		this.ventanas = ventanas;
		this.caballos = caballos;
	}

	@Override
	public void mover(int tiempo){
		super.mover(tiempo);
		this.posX=this.posX+(int)(Math.random()*99);
	}
	
	@Override
	public String toString(){
		return super.toString()+" y tiene"+this.ventanas+" ventanas";
	}

	public int getVentanas() {
		return ventanas;
	}

	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	
	
	
	
}
