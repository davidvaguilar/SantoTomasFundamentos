package com.santotomas.clase0111;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String autor,titulo;
		Libro libro1=new Libro();
		
		System.out.println("Introduce un Titulo:");
		titulo=entrada.next();
		System.out.println("Introduce un Autor: ");
		autor=entrada.next();
		
		libro1.setTitulo(titulo);
		libro1.setAutor(autor);
		libro1.setEjemplar(1);
		
		
		//libro1.devolucion();
		
		System.out.println("El primer Libro registrado es:");
		System.out.println("Titulo: "+ libro1.getTitulo());
		System.out.println("Autor: "+ libro1.getAutor());
		System.out.println("Prestados: "+libro1.getPrestados());

		System.out.println("Ejemplares: "+libro1.getEjemplar());
		
		//libro1.prestamos();
		//System.out.println("\n\n\n Prestados: "+libro1.getPrestados());
		
		
	}

}
