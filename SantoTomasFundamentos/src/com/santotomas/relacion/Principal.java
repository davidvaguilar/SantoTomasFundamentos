/**
 * 
 */
package com.santotomas.relacion;

/**
 * @author David
 *
 */
public class Principal {

	private Cliente cliente;
	
	public Principal() {

		cliente=new Cliente();
	}
	
	public void entrada(){
		cliente.setCliNombre("Pepito");
		cliente.setCliCodigo(3);
		
		
		TarjetaCredito tarjeta1=new TarjetaCredito();
		tarjeta1.setCodigo(4567);
		tarjeta1.setLimite(100000);
		
		
		cliente.setTarjetaCredito(tarjeta1);
		cliente.getVendedor().setVenRut("4444-4");
		cliente.getVendedor().setVenNombre("Kike");
		
		
	}
	
	public void salida(){
		System.out.println(cliente.toString());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Principal ventana=new Principal();
		ventana.entrada();
		ventana.salida();

	}

}
