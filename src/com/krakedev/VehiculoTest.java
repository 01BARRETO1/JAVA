package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		v=new Vehiculo();
		
		System.out.println("-------------Vehiculo 1 : Creado----------------------------------");
	
		System.out.println("Anio: "+ v.getAnio());
		System.out.println("Marca: "+ v.getMarca());
		System.out.println("Modelo: "+ v.getModelo());
		
		System.out.println("-------------Vehiculo 1 : Valores creados-----------");
		
		v.setAnio("2024");
		v.setMarca("Zusuqui");
		v.setModelo("Nuevo");
		
		System.out.println("Anio: "+ v.getAnio());
		System.out.println("Marca: "+ v.getMarca());
		System.out.println("Modelo: "+ v.getModelo());
		
		System.out.println("-------------Vehiculo 2 : Creado-----------");
		
		Vehiculo v2= new Vehiculo();
		
		System.out.println("Anio: "+ v2.getAnio());
		System.out.println("Marca: "+ v2.getMarca());
		System.out.println("Modelo: "+ v2.getModelo());
		
		System.out.println("-------------Vehiculo 2 : Valores creados-----------");
		
		v2.setAnio("2026");
		v2.setMarca("chevrolet");
		v2.setModelo("Mas rapido");
		
		System.out.println("Anio: "+ v2.getAnio());
		System.out.println("Marca: "+ v2.getMarca());
		System.out.println("Modelo: "+ v2.getModelo());
	}

}
