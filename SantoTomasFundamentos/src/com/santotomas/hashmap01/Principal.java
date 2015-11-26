/**

 * 
 */
package com.santotomas.hashmap01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author David
 *
 */
public class Principal {

	
	public Principal() {
		// TODO Auto-generated constructor stub
	}
	
	public void menu(){
		HashMap<String, Float> lista=new HashMap<String,Float>();
		Scanner input=new Scanner(System.in);
		int opcion=5;
		String codigo;
		Float valor;
		
		do{
			System.out.println("Ingrese Opcion valida:");
			System.out.println("1.- Introducir producto");
			System.out.println("2.- Actualizar Producto");
			System.out.println("3.- Mostrar Productos");
			System.out.println("4.- Eliminar Productos");
			System.out.println("5.- Salir");
			opcion=input.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Ingrese codigo");
				codigo=input.next();
				System.out.println("Ingrese valor");
				valor=input.nextFloat();
				guardar(codigo, valor, lista);
				break;
			case 2:
				System.out.println("Ingrese codigo a modificar");
				codigo=input.next();
				modificar(codigo, lista);
				
				break;
			case 3:
				mostrar(lista);
				
				break;
			case 4:
				System.out.println("Ingrese codigo a eliminar");
				codigo=input.next();
				eliminar(codigo,lista);
				break;
			case 5:
				break;
			default:
				System.out.println("Opcion No Valida");
			}
			
		}while(opcion!=5);
		
		
	}
	
	public static void guardar(String codigo, Float valor, HashMap<String, Float> listaProductos){
		if(listaProductos.containsKey(codigo)){
			System.out.println("Valor ya existe");
		}else{
			listaProductos.put(codigo, valor);
		}
	}
	
	public static void modificar(String codigo, HashMap<String, Float>lista){
		Scanner entrada=new Scanner(System.in);
		if (lista.containsKey(codigo)) {
			System.out.println("Ingrese el valor ");
			lista.put(codigo, entrada.nextFloat());
		}else{
			System.out.println("No existe valor a modificar");
		}
		
	}
	
	public static void mostrar(HashMap<String, Float>lista){
		String clave;
		Iterator<String> lis=lista.keySet().iterator();
		while(lis.hasNext()){
			clave=lis.next();
			System.out.println(lista.get(clave));
		}
		
	}
	
	
	public static void eliminar (String codigo, HashMap<String, Float>lis){
		if(lis.containsKey(codigo)){
			lis.remove(codigo);
		}else{
			System.out.println("No existe el valor buscado");
		}
		
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Principal consola=new Principal();
		consola.menu();

	}

}
