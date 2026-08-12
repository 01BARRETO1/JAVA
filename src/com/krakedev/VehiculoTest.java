package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		v=new Vehiculo();
		
		System.out.println("-------------Vehiculo 1 : Creado----------------------------------");
	
		System.out.println("Anio: "+ v.anio);
		System.out.println("Marca: "+ v.marca);
		System.out.println("Modelo: "+ v.modelo);
		
		System.out.println("-------------Vehiculo 1 : Valores creados-----------");
		
		v.anio="2024";
		v.marca="Zusuqui";
		v.modelo="Nuevo";
		
		System.out.println("Anio: "+ v.anio);
		System.out.println("Marca: "+ v.marca);
		System.out.println("Modelo: "+ v.modelo);
		
		System.out.println("-------------Vehiculo 2 : Creado-----------");
		
		Vehiculo v2= new Vehiculo();
		System.out.println("-------------Vehiculo 2 : Valores creados-----------");
		
		v2.anio="2026";
		v2.marca="chevrolet";
		v2.modelo="Mas rapido";
		
		System.out.println("Anio: "+ v2.anio);
		System.out.println("Marca: "+ v2.marca);
		System.out.println("Modelo: "+ v2.modelo);
	}

}
