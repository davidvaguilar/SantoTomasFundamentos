/**
 * 
 */
package com.santotomas.relacion;

import com.santotomas.relacion.TarjetaCredito;
import com.santotomas.relacion.Vendedor;

/**
 * @author David
 *
 */
public class Cliente {

	private int cliCodigo;
	private String cliNombre;
	private TarjetaCredito tarjetaCredito;
	private Vendedor vendedor;
	
	public Cliente() {
		this.cliCodigo=0;
		this.cliNombre="";
		this.vendedor=new Vendedor();
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "El codigo del Cliente es=" + this.cliCodigo + 
				", se llama= " + this.cliNombre + 
				", tarjetaCredito=" + this.tarjetaCredito
				+ ", vendedor=" + this.vendedor + "]";
	}



	public int getCliCodigo() {
		return cliCodigo;
	}

	public void setCliCodigo(int cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public String getCliNombre() {
		return cliNombre;
	}

	public void setCliNombre(String cliNombre) {
		this.cliNombre = cliNombre;
	}

	public TarjetaCredito getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	
	
	
}
