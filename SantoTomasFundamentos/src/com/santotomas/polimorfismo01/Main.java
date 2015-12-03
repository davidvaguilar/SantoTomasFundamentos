/**
 * 
 */
package com.santotomas.polimorfismo01;

/**
 * @author David
 *
 */
public class Main {
	private final double RADIO=2;
	private final double LARGO=5;
	private Figura pelota;
	private Figura dado;
	
	public Main() {
		this.pelota=new Circulo(this.RADIO);
		this.dado=new Cuadrado(this.LARGO);
	}
	
	public void salida(){
		System.out.println(pelota.calculoArea());
		System.out.println(dado.calculoArea());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main consola=new Main();
		consola.salida();

	}

}
