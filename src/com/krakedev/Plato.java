package com.krakedev;

public class Plato {
	
	private String nombre;
	private String tipo;
	private double precio;
	private boolean disponible;
	
	//generar constructor 1 con dos parametros
	public Plato(String nombre, boolean disponible) {
		this.nombre=nombre;
		this.disponible=disponible;
	}
	
	//generar constructor 2 con tres parametros
		public Plato(String nombre, String tipo, double precio) {
			this.nombre=nombre;
			this.tipo=tipo;
			this.precio=precio;
		}
		
	//generar constructor 2 con 1 parametro
		public Plato(boolean disponible) {
			
			this.disponible=disponible;
		}
		
		
	
	//get and set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	

}
