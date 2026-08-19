package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		//instaciar 3 cuadrados
		Cuadrado c1=new Cuadrado(4);
		Cuadrado c2=new Cuadrado(6);
		Cuadrado c3=new Cuadrado(3);
		
		//valores de los cuadrados
		
//		c1.setLado(4);
//		c2.setLado(6);
//		c3.setLado(3);
		
		//variabes para calcular area y perimetro, testear
		
		double areaCuadrado1=c1.calcularArea();
		double perimetroCuadrado1=c1.calcularPerimetro();
		
		double areaCuadrado2=c2.calcularArea();
		double perimetroCuadrado2=c2.calcularPerimetro();
		
		double areaCuadrado3=c3.calcularArea();
		double perimetroCuadrado3=c3.calcularPerimetro();
		
		//Mostrar resultados
		
		System.out.println("El area del cuadrado de lado "+c1.getLado()+" es "+
		areaCuadrado1 +" y su perimetro es "+perimetroCuadrado1);
		
		System.out.println("El area del cuadrado de lado "+c2.getLado()+" es "+
		areaCuadrado2 +" y su perimetro es "+perimetroCuadrado2);
		
		System.out.println("El area del cuadrado de lado "+c3.getLado()+" es "+
		areaCuadrado3 +" y su perimetro es "+perimetroCuadrado3);		
	}

}
