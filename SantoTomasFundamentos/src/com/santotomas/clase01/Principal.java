package com.santotomas.clase01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String dni, nombre,texto;
		char sexo;
		int edad;
		float peso;
		double altura;
		texto=JOptionPane.showInputDialog("Introducir DNI");
		dni=texto;
		texto=JOptionPane.showInputDialog("Introducir NOMBRE");
		nombre=texto;
		texto=JOptionPane.showInputDialog("Introducir SEXO");
		sexo=texto.charAt(0);
		texto=JOptionPane.showInputDialog("Introducir EDAD");
		edad=Integer.parseInt(texto);
		texto=JOptionPane.showInputDialog("Introducir PESO");
		peso=Float.parseFloat(texto);
		texto=JOptionPane.showInputDialog("Introducir ALTURA");
		altura=Double.parseDouble(texto);
		
		Persona per1=new Persona(nombre, edad, dni, sexo, peso, altura);
		
		System.out.println(per1.toString());
		
//		if(per1.esMayorDeEdad()){
//			System.out.println("Es Mayor de Edad");
//			
//		}else{
//			System.out.println("Es de menor edad");
//		}
//			
//		if(0==per1.calcularIMC()){
//			System.out.println("Peso ideal");
//		}else if(Persona.BAJO_PESO==per1.calcularIMC()){
//			System.out.println("Bajo Peso");
//		}else{
//			System.out.println("Sobre Peso");
//		}
			
		
		


		
	}

}
