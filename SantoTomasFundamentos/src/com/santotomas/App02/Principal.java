/**
 * 
 */
package com.santotomas.App02;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Contador cont1=new Contador(-9);

		cont1.decrementar();
		System.out.println("Contador tiene= "+cont1.getCont());
	}

}
