/**
 * 
 */
package com.santotomas.iterator01;

/**
 * @author David
 *
 */
public class Departamento {

	private Empleado[] empleados=new Empleado[100];
	private int correlativo=0;
	private String depNombre;
	
	public Departamento(String n) {
		this.depNombre=n;
	}
	
	public String getDepNombre(){
		return this.depNombre;
	}
	
	public void add(String n){
		Empleado e=new Empleado(n, this.depNombre);
		empleados[correlativo++]=e;
		
	}
	
	public DivisionIterator iterator(){
		return new DivisionIterator(empleados);
	}
	
}
