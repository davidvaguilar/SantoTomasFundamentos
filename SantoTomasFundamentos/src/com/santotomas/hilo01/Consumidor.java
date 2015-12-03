/**
 * 
 */
package com.santotomas.hilo01;

import java.util.ArrayList;

/**
 * @author David
 *
 */
public class Consumidor implements Runnable{

	private ArrayList<String> productos;
	
	public Consumidor(ArrayList<String>productos) {
		this.productos=productos;
	}

	@Override
	public void run() {
		try {
			synchronized (this.productos) {
				if(this.productos.size()==0){
					System.out.println("NO hay productos");
					this.productos.wait();
				}
				this.productos.remove(0);
				System.out.println("Se ha consumido");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
