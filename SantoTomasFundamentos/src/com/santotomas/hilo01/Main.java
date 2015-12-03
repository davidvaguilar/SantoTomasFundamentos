/**
 * 
 */
package com.santotomas.hilo01;

import java.util.ArrayList;

/**
 * @author David
 *
 */
public class Main {

	private ArrayList<String> productos;
	private Productor p;
	private Consumidor c;
	
	
	public Main() {
		this.productos=new ArrayList<String>();
		this.p=new Productor(this.productos);
		this.c=new Consumidor(this.productos);
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		Thread t4=new Thread(c);
		Thread t5=new Thread(p);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	}
	
	
	public static void main(String[] args) {
		Main windows=new Main();
		

	}

}
