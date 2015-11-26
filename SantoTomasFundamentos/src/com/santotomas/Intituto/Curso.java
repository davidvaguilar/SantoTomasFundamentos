package com.santotomas.Intituto;

public class Curso {

	private String curNombre;
	
	public Curso() {
		this.curNombre="";
	}

	public Curso(String n) {
		this.curNombre=n;
	}
	
	@Override
	public String toString() {
		return "El curso tiene el nombre: "+ this.curNombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean bandera=false;
		if(obj instanceof Curso){
			Curso cur=(Curso) obj;
			if( this.getCurNombre().equals(cur.getCurNombre())){
				bandera=true;
			}
		}
		return bandera;	
	}

	public String getCurNombre() {
		return curNombre;
	}

	public void setCurNombre(String curNombre) {
		this.curNombre = curNombre;
	}
	
	
	
	
}
