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
	}
	
	public void menu(){
		HashMap<String, Float> listaProductos=new HashMap<String, Float>();
		Scanner input=new Scanner(System.in);
		int opcion=5;
		String codigo;
		Float precio;
		do{
			System.out.println("Introducir el numero de la opcion: ");
			System.out.println("1.- Introducir Productos");
			System.out.println("2.- Modificar precio");
	        System.out.println("3.- Mostrar todos los productos");
	        System.out.println("4.- Eliminar producto");
	        System.out.println("5.- Salir");
	        opcion=input.nextInt();
	        
	        switch (opcion) {
			case 1:
				System.out.println("Introduce el códido del producto:");
                codigo = input.next();
                System.out.println("Introduce el precio del producto:");
                precio = input.nextFloat();
                guardarProducto(codigo,precio,listaProductos);
				break;
			case 2:
				System.out.println("Introduce el códido del producto del que quieres cambiar el precio:");
                codigo = input.next();
                modificaPrecio(codigo,listaProductos);
				break;
			case 3:
				mostrarProductos(listaProductos);
				break;
			case 4:
				System.out.println("Introduce el códido del producto que quieres eliminar:");
                codigo = input.next();
                eliminaProducto(codigo,listaProductos);
				break;
			case 5:
				break;
			default:
				break;
			}
	        
		}while(opcion!=5);
		
	}
	
	
	public static void guardarProducto(String codigo, float precio, HashMap <String,Float> listaProductos){
	    if (listaProductos.containsKey(codigo)){
	        System.out.println("No se puede introducir el producto. El código esta repetido.");
	    }
	    else{
	        listaProductos.put(codigo, precio);               
	    }
	}
	
	
	public static void modificaPrecio(String codigo, HashMap<String,Float> listaProductos){
	    Scanner sc = new Scanner(System.in);
	    if (listaProductos.containsKey(codigo)){
	        System.out.println("Introduce el precio del producto:");
	        listaProductos.put(codigo, sc.nextFloat());            
	    }
	    else{
	        System.out.println("No hay ningun producto con ese código.");
	    }
	}
	
	public static void mostrarProductos(HashMap<String, Float> listaProductos){
	    String clave;
	    Iterator<String> productos = listaProductos.keySet().iterator();
	    System.out.println("Hay los siguientes productos:");

	    while(productos.hasNext()){
	        clave = productos.next();
	        System.out.println(clave + " - " + listaProductos.get(clave));
	    }        
	}
	

	public static void eliminaProducto(String codigo, HashMap<String,Float> listaProductos){
	        if (listaProductos.containsKey(codigo)){
	            listaProductos.remove(codigo);
	        }
	        else{
	            System.out.println("No hay ningun producto con ese código.");  
	        }       
	    } 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Principal interfazComando=new Principal();
		interfazComando.menu();

	}

}
