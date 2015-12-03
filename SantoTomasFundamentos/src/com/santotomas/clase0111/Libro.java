package com.santotomas.clase0111;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplar;
	private int prestados;
	
	public Libro(){
	}
	
	public Libro(String titulo, String autor, int ejemplar, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplar = ejemplar;
		this.prestados = prestados;
	}
	
	public Libro (String titulo){
		this.titulo = titulo;
	}
	
	public Libro(String x,String y){
		this.titulo=x;
		this.autor=y;
		this.ejemplar=1;
	}

	public String getAutor() {
		return autor;
	}
	public String getTitulo(){
		return titulo;
	}
	public int getEjemplar(){
		return ejemplar;
	}
	public int getPrestados(){
		return prestados;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setEjemplar(int ejemplar) {
		this.ejemplar = ejemplar;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	public boolean prestamos(){
		boolean prestamo=true;
		if(prestados<ejemplar){
			prestados=prestados+1;
		}else{
			prestamo=false;
		}
		return prestamo;
	}
	public boolean devolucion(){
		boolean devuelto=true;
		if(prestados==0){
			devuelto=false;
		}else{
			prestados--;
			
		}
		
		return devuelto;
	}
	
	
	
}
