/**
 * 
 */
package com.santotomas.relacion;

/**
 * @author David
 * @version 1.0 
 * 
 */
public class TarjetaCredito {

	private int codigo;
	private double limite;
	
	public TarjetaCredito() {
		this.codigo=0;
		this.limite=0.0d;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Funcion 
	 */
	@Override
	public String toString() {
		return "El codigo de la tarjeta es=" + this.codigo + 
				", y su limite=" + this.limite + "]";
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
}
