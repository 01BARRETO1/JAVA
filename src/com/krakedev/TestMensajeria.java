package com.krakedev;

public class TestMensajeria {

	public static void main(String[] args) {
		Mensajeria m1 = new Mensajeria();
		//variable saludo, colocar el saludo
		m1.setSaludo("Qué más mi brother");
		m1.saludar();
		//saludarPersona
		m1.setNombre("Cristiano");
		m1.setApodo("El bicho");
		m1.saludarPersona();
		

	}

}
