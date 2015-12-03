package com.santotomas.iterator01;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Departamento d=new Departamento("Almacen Doña Juanita");
		
		d.add(JOptionPane.showInputDialog("Hola"));
		d.add(JOptionPane.showInputDialog("Hola2"));
		Iterator<Empleado> i=d.iterator();
		while(i.hasNext()){
			Empleado e=(Empleado)i.next();
			System.out.println(e);
		}
	}
}
