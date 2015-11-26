package com.santotomas.Intituto;

public class Matricula {

	private int aluCodigo;
	private String curNombre;
	
	public Matricula() {
		this.aluCodigo=0;
		this.curNombre="";
	}

	public Matricula(int aluCodigo, String curNombre) {
		this.aluCodigo = aluCodigo;
		this.curNombre = curNombre;
	}

	@Override
	public String toString() {
		return "EL alumno codigo: "+this.aluCodigo
				+ "esta matriculado en: "+this.curNombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean bandera=false;
		if(obj instanceof Matricula){
			Matricula mat=(Matricula) obj;
			if(this.getAluCodigo()==mat.getAluCodigo()
					&& this.getCurNombre().equals(mat.getCurNombre())){
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

	public String getCurNombre() {
		return curNombre;
	}

	public void setCurNombre(String curNombre) {
		this.curNombre = curNombre;
	}	
}
