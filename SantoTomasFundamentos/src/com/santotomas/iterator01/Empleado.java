/**
 * 
 */
package com.santotomas.iterator01;

/**
 * @author David
 *
 */
public class Empleado {

	private String empNombre;
	private String empDivision;
	
	public Empleado(String n, String d) {
		this.empNombre=n;
		this.empDivision=d;
	}
	
	public String getEmpNombre(){
		return this.empNombre;
	}
	
	@Override
	public String toString(){
		return "El nombre del empleado es:" +this.empNombre+
				" y su division es: "+this.empDivision;
	}
	
	
	
}
