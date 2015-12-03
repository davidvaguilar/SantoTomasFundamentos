/**
 * 
 */
package com.santotomas.polimorfismo02;

/**
 * @author David
 *
 */
public class Vehiculo {

	protected int patente;
	protected String conductor;
	
	public Vehiculo() {
		this.patente=0;
		this.conductor="";
	}
	
	public void apagar(){
		
	}
	
	public void enciende(){
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El vehiculo tiene la patente: "+this.patente;
				
	}
	
	
}
