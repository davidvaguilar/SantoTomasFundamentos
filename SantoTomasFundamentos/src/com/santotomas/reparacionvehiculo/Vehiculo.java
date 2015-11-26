package com.santotomas.reparacionvehiculo;

public class Vehiculo {

	private long entrada,reparacion,salida;
	private String modelo;
	private String matricula;
	
	public Vehiculo(String matricula, String modelo, long entrada) {
		modelo=modelo;
		matricula=matricula;
		entrada=entrada;
		salida=0;
		reparacion=0;
	}
	
	public boolean estadoReparacion(){
		if(this.reparacion==0)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString(){
		return "El vehiculo matricula: "+this.matricula+" modelo: "+this.modelo;
	}
	
	
	
	
	

	/**
	 * @return the entrada
	 */
	public long getEntrada() {
		return entrada;
	}

	/**
	 * @param entrada the entrada to set
	 */
	public void setEntrada(long entrada) {
		this.entrada = entrada;
	}

	/**
	 * @return the reparacion
	 */
	public long getReparacion() {
		return reparacion;
	}

	/**
	 * @param reparacion the reparacion to set
	 */
	public void setReparacion(long reparacion) {
		this.reparacion = reparacion;
	}

	/**
	 * @return the salida
	 */
	public long getSalida() {
		return salida;
	}

	/**
	 * @param salida the salida to set
	 */
	public void setSalida(long salida) {
		this.salida = salida;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
