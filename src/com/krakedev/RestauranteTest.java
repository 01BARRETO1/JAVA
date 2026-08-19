package com.krakedev;

public class RestauranteTest {

	public static void main(String[] args) {
		Restaurante rest1= new Restaurante();
		Restaurante rest2= new Restaurante();
		
		//System.out.println("-------------Restaurante 1-----------");
		
//		rest1.nombre="Palma";
//		
//		rest1.direccion="Colón";
//		
//		rest1.calificacion=9.8;
		
		rest1.setNombre("Palma");
		rest1.setDireccion("Colón");
		rest1.setCalificacion(9.8);
		
		//System.out.println("-------------Restaurante 2-----------");
		
//		rest2.nombre="Coral";
//		
//		rest2.direccion="Bicentenario";
//		
//		rest2.calificacion=8.3;
		
		rest2.setNombre("Coral");
		rest2.setDireccion("Bicentenario");
		rest2.setCalificacion(8.3);
		
		System.out.println("###Restaurante 1###");
		System.out.println("Nombre:"+ rest1.getNombre());
		System.out.println("Direccion:"+rest1.getDireccion());
		System.out.println("Calificacion: "+rest1.getCalificacion());
		
		System.out.println("###Restaurante 2###");
		System.out.println("Nombre:"+ rest2.getNombre());
		System.out.println("Direccion:"+rest2.getDireccion());
		System.out.println("Calificacion: "+rest2.getCalificacion());
		
		

	}

}
