package com.santotomas.clase01;

public final class Persona {
	//Constantes
	private final static char SEXO_PRED='H';
	public static final int BAJO_PESO=-1;
	public final int IDEAL_PESO=0;
	public final int SOBRE_PESO=1;
	
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private float peso;
	private double altura;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String dni) {
		this("", 0,dni, SEXO_PRED, 0, 0);
	}

	public Persona(String nombre, int edad, String dni, char sexo, float peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	public void comprobarSexo(char sexo){
		if(sexo=='H'||sexo=='M')
			this.sexo=sexo;
		else
			this.sexo='H';
	}
	
	public int calcularIMC(){
		double imc=0;
		imc= this.peso/(Math.pow(this.altura, 2));
		if(imc>=20 && imc<=25){
			return IDEAL_PESO;
		}else if(imc<20){
				return BAJO_PESO;
		}else{
			return SOBRE_PESO;
		}
	}
	
	public boolean esMayorDeEdad(){
		boolean mayor=false;
		if(this.edad>=18){
			mayor=true;
		}
		return mayor;
	}
	
	@Override
	public String toString(){
        String sexo="";
        if(this.sexo=='H'){
            sexo="hombre";
        }else{
            sexo="mujer";
        }
        return "Informacion de la persona:\n" +
                "Nombre: "+nombre+"\n" +
                "Sexo: "+sexo+"\n" +
                "Edad: "+edad+" años\n" +
                "DNI: "+dni+"\n" +
                "Peso: "+peso+" kg\n" +
                "Altura: "+altura+" metros\n";
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}	 
	

	
}
