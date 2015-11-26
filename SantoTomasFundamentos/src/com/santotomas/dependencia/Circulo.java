/**
 * 
 */
package com.santotomas.dependencia;

/**
 * @author David
 *
 */
public class Circulo implements Figura {

	private double radio;
	
	public Circulo(double r) {
		this.radio=r;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*(radio*radio);
	}

}
