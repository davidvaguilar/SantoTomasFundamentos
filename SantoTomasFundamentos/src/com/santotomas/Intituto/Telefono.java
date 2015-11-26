package com.santotomas.Intituto;

public class Telefono {

	private int aluCodigo;
	private int telNumero;
	
	public Telefono() {
		this.aluCodigo=0;
		this.telNumero=0;
	}

	public Telefono(int aluCodigo, int telNumero) {
		this.aluCodigo = aluCodigo;
		this.telNumero = telNumero;
	}
	
	@Override
	public String toString() {
		return "El telefono es:"+this.telNumero;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean bandera=false;
		if(obj instanceof Telefono){
			Telefono tel=(Telefono) obj;
			if(this.getTelNumero()==tel.getTelNumero()){
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

	public int getTelNumero() {
		return telNumero;
	}

	public void setTelNumero(int telNumero) {
		this.telNumero = telNumero;
	}	
}
