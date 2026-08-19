package com.krakedev;

public class Mensajeria {
	//variable para la funcion saludar
	private String saludo;
	//Variables funcion saludarPersona
	private String nombre;
	private String apodo;
	
	//get and set
	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//get set --- saludarPersona
	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	
	public void saludar() {
		System.out.println(saludo);
	}
	
	
	
	public void saludarPersona() {
		System.out.println("Hola "+nombre + ", Tu apodo es "+apodo);
	}

}
