package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int r1 = c1.sumar(4, 2);
		
		System.out.println("Resultado suma: "+r1 );
		
		int r2=c1.restar(4, 2);
		
		System.out.println("Resultado resta: "+r2 );

	}

}
