/**
 * 
 */
package com.santotomas.polimorfismo01;

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
	public double calculoArea() {
		return largo*largo;
	}

	
}
