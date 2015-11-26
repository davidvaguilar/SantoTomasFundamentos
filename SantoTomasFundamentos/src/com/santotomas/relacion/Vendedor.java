/**
 * 
 */
package com.santotomas.relacion;

/**
 * @author David
 *
 */
public class Vendedor {

	private String venRut;
	private String venNombre;
	
	
	public Vendedor() {
		this.venRut="";
		this.venNombre="";
	}


	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vendedor [venRut=" + venRut + 
				", venNombre=" + venNombre + "]";
	}



	public String getVenRut() {
		return venRut;
	}


	public void setVenRut(String venRut) {
		this.venRut = venRut;
	}


	public String getVenNombre() {
		return venNombre;
	}


	public void setVenNombre(String venNombre) {
		this.venNombre = venNombre;
	}
	
	
}
