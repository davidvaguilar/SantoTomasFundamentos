/**
 * 
 */
package com.santotomas.polimorfismo01;

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
	public double calculoArea() {
		return Math.PI*(radio*radio);
	}

}
