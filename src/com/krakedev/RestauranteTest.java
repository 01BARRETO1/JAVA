package com.krakedev;

public class RestauranteTest {

	public static void main(String[] args) {
		Restaurante rest1= new Restaurante();
		Restaurante rest2= new Restaurante();
		
		//System.out.println("-------------Restaurante 1-----------");
		
		rest1.nombre="Palma";
		
		rest1.direccion="Colón";
		
		rest1.calificacion=9.8;
		
		//System.out.println("-------------Restaurante 2-----------");
		
		rest2.nombre="Coral";
		
		rest2.direccion="Bicentenario";
		
		rest2.calificacion=8.3;
		
		System.out.println("###Restaurante 1###");
		System.out.println("Nombre:"+ rest1.nombre);
		System.out.println("Direccion:"+rest1.direccion);
		System.out.println("Calificacion: "+rest1.calificacion);
		
		System.out.println("###Restaurante 2###");
		System.out.println("Nombre:"+ rest2.nombre);
		System.out.println("Direccion:"+rest2.direccion);
		System.out.println("Calificacion: "+rest2.calificacion);
		
		

	}

}
