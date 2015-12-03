package com.santotomas.herencia02;

public class Principal {

	public static void main(String[] args) {
		Vehiculo v1=new Vehiculo(4, "Pepe", "verde", 40, 2);
		//System.out.println("Posicion 1: "+ v1.getPosX());
		
		v1.setColor("Rojo");
		//v1.mover(2);
		//System.out.println("Posicion Actual: "+ v1.getPosX());
		System.out.println(v1.toString());
		
		Auto car1=new Auto(4, "Jose", "rojo", 100, 2, 6, 800);
		//car1.mover(2);
		//System.out.println("pos Auto= "+car1.getPosX());
		System.out.println(car1.toString());
		
	}

}
