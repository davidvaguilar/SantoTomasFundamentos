/**
 * 
 */
package com.santotomas.dependencia;

/**
 * @author David
 *
 */
public class Principal {

	private Figura dado;
	private Figura pelota;
	
	public Principal() {
		this.pelota=new Circulo(5);
		this.dado=new Cuadrado(30);
	}
	
	public void salida(){
		System.out.println(this.pelota.calcularArea());
		System.out.println(this.dado.calcularArea());
	}
	
	public static void main(String[] args) {
		Principal consola=new Principal();
		consola.salida();

	}

}
