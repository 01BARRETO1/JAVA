package com.krakedev;

public class Rectangulo {
	
	public int base;
	public int altura;
	
	public int calcularArea() {
		
		int area=base * altura;
		
		return area;
		
	}
	
	//Calcular el perímetro de un rectángulo
	public double calcularPerimetro() {
		double perimetro=(base+altura)*2;
		
		return perimetro;
		
	}
	

}
