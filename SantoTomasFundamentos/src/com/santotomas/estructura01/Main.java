/**
 * 
 */
package com.santotomas.estructura01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author David
 *
 */
public class Main {

	private Stack<String> libros;
	private Queue<String> impresion;
	private HashMap<String, Persona> personas;
	
	
	public Main() {
		this.libros=new Stack<String>();
		this.impresion=new LinkedList<String>();
		this.personas=new HashMap<String, Persona>();
	}
	
	public void Pila() {
		this.libros.push("El quijote");
		this.libros.push("La Biblia");
		this.libros.push("Programacion");
		
		System.out.println(this.libros.pop());
		System.out.println(this.libros.peek());
		System.out.println(this.libros.peek());
	}

	public void Cola() {
		this.impresion.add("libro");
		this.impresion.add("revista");
		this.impresion.add("diario");
		
		System.out.println("Imprimiendo= "+this.impresion.poll()); //Saca
		System.out.println("El siguiente es= "+this.impresion.peek()); //Pregunta
		System.out.println("El siguiente es="+this.impresion.peek());
	}
	
	public void Diccionario(){
		this.personas.put("nico", new Persona("Nicolas", "Fernandez", "11111-2"));
		this.personas.put("pepe", new Persona("Pedro", "Gonzalez","2222-3"));
		this.personas.put("kike", new Persona("Enrique", "Gomez", "3333-4"));
		
		System.out.println(this.personas.get("kike").getNombre());
		Persona p1=this.personas.get("pepe");
		
	}
		
	public static void main(String[] args) {
		Main windows=new Main();
		windows.Pila();
		System.out.println(); // espacio
		windows.Cola();
		System.out.println(); //espacio
		windows.Diccionario();
	}

}
