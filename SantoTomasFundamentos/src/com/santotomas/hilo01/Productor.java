/**
 * 
 */
package com.santotomas.hilo01;

import java.util.ArrayList;

/**
 * @author David
 *
 */
public class Productor implements Runnable {

	private ArrayList<String> productos;
	
	public Productor(ArrayList<String> productos) {
		this.productos=productos;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(2000);
				synchronized (this.productos) {
					productos.add("producto");
					productos.notify();
					System.out.println("Agregado, un producto a la lista");
				}			
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
