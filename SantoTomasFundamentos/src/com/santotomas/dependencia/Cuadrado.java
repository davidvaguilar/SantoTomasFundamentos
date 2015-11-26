/**
 * 
 */
package com.santotomas.dependencia;

/**
 * @author David
 *
 */
public class Cuadrado implements Figura {

	private double largo;
	
	public Cuadrado(double l) {
		this.largo=l;
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return largo*largo;
	}

}
