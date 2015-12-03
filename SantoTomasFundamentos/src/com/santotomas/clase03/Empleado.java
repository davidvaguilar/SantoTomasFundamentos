/**
 * 
 */
package com.santotomas.clase03;

/**
 * @author David
 *
 */
public class Empleado {

	//atributo de clase
	private static double pagoPorHoraExtra;
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
    private double tipoIRPF;
    private char casado;  //S ó N
    private int numeroHijos;
	
	/**
	 * 
	 */
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nif) {
        this.nif = nif;
    }

//	Calcula el Total de Horas Extras Horas Extras * Pago
	public double calcularImporteHorasExtras(){
        return horasExtras * pagoPorHoraExtra;
    }
	
	public double calcularRetencionIrpf(){
        double tipo = tipoIRPF;
        if(casado == 's' || casado == 'S') {
            tipo = tipo - 2; //2 puntos menos si está casado
        }
        tipo = tipo - numeroHijos; //un punto menos por cada hijo
        if(tipo<0){
            tipo = 0;
        }
        return calcularSueldoBruto() * tipo / 100;
    }
	
	public double calcularSueldo(){
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }
	
	//calcular el sueldo bruto
    public double calcularSueldoBruto(){
        return sueldoBase + calcularImporteHorasExtras();
    }

	@Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("\nNif: ");
//        sb.append(nif);
//        sb.append("\nSueldo Base: ");
//        sb.append(sueldoBase);
//        sb.append("\nHoras Extras: ");
//        sb.append(horasExtras);
//        sb.append("\ntipo IRPF: ");
//        sb.append(tipoIRPF);
//        sb.append("\nCasado: ");
//        sb.append(casado);
//        sb.append("\nNúmero de Hijos: ");
//        sb.append(numeroHijos);
//		return  sb.toString();
		String cadena;
		cadena="\nNif: ";
		cadena+=nif;
		cadena+="\nSueldo Base: ";
		cadena+=sueldoBase;
		cadena+="\nHoras Extras: ";
		cadena+=horasExtras;
		cadena+="\ntipo IRPF: ";
		cadena+=tipoIRPF;
		cadena+="\nCasado: ";
		cadena+=casado;
		cadena+="\nNúmero de Hijos: ";
		cadena+=numeroHijos;
		return cadena;
    }
	
	public static double getPagoPorHoraExtra() {
		return pagoPorHoraExtra;
	}

	public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
		Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public char getCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	
	
}
