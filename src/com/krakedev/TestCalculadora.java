package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int r1 = c1.sumar(4, 2);
		
		System.out.println("Resultado suma: "+r1 );
		
		int r2=c1.restar(4, 2);
		
		System.out.println("Resultado resta: "+r2 );
		
		//Funcion multiplicar
		Calculadora multiplicacion = new Calculadora();
		
		double m = multiplicacion.multiplicar(10, 5);
		
		System.out.println("La multiplicacion es : "+ m );
		
		//funcion Dividir
		
		Calculadora division=new Calculadora();
		//Variable d ... en la variable guardamos el llamado (el cociente)
		double d=division.dividir(10, 2);
		//mostrar en consola
		System.out.println("La division es: "+ d);
		
		//funcion promediar
		
		Calculadora promedio=new Calculadora();
		
		double p=promedio.promediar(10, 8, 9);
		
		System.out.println("El promedio es: "+p);
		
		//funcion mostrarResultado
		
		c1.mostrarResultado();

	}
	
	
	
	

}
