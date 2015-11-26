package com.santotomas.Intituto;

public class Alumno {

	private int aluCodigo;
	private String aluNombre;
	private String aluApellido;
	
	public Alumno() {
		this.aluCodigo=0;
		this.aluNombre="";
		this.aluApellido="";
	}
	public Alumno(int codigo, String nombre,String apellido) {
		this.aluCodigo=codigo;
		this.aluNombre=nombre;
		this.aluApellido=apellido;
	}
	@Override
	public String toString() {
		return "El Alumno tiene el codigo: " + this.aluCodigo 
				+" y su nombre completo es: "
				+ this.aluNombre +" "+ this.aluApellido;
	}
	
	@Override
	public boolean equals(Object obj){
		boolean bandera=false;
		if(obj instanceof Alumno){
			Alumno alu=(Alumno) obj;
			if( this.getAluNombre().equals(alu.getAluNombre())
					&& this.getAluApellido().equals(alu.getAluApellido())){
				bandera=true;
			}
		}
		return bandera;
	}
	
	public int getAluCodigo() {
		return aluCodigo;
	}
	public void setAluCodigo(int aluCodigo) {
		this.aluCodigo = aluCodigo;
	}
	public String getAluNombre() {
		return aluNombre;
	}
	public void setAluNombre(String aluNombre) {
		this.aluNombre = aluNombre;
	}
	public String getAluApellido() {
		return aluApellido;
	}
	public void setAluApellido(String aluApellido) {
		this.aluApellido = aluApellido;
	}
	
	
	
}
