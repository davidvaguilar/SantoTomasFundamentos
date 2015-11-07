/**
 * 
 */
package com.santotomas.App02;

/**
 * @author David
 *
 */
public final class Contador {

	/**
	 * 
	 */
	
	private int cont;
	
	public Contador(int cont) {
		
		if(cont<0){
			System.out.println("UPS: "+this.cont);
			this.cont=0;
			
		}else{
			this.cont=cont;
		}
	}
	
	public void incrementar(){
		cont++;
	}
	
	public void decrementar(){
		
		this.cont--;
		
		if(cont<0){
			cont=0;
		}
	}

	/**
	 * @return the cont
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * @param cont the cont to set
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	

}
