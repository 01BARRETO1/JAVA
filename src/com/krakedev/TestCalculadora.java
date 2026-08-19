package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora(4,2); //metodo constructor
		
		//int r1 = c1.sumar(4, 2);
		//valores para la funcion
		//c1.setNum1(4);
		//c1.setNum2(2);
		//llamamos a la funcion
		int r1 = c1.sumar();
		
		System.out.println("Resultado suma: "+r1 );
		
		//int r2=c1.restar(4, 3);
		//valores para la funcion
		c1.setNum1(4);
		c1.setNum2(3);
		//llamamos a la funcion
		int r2=c1.restar();
		System.out.println("Resultado resta: "+r2 );
		
		//Funcion multiplicar
		Calculadora multiplicacion = new Calculadora(10.0,5.0);
		
		//double m = multiplicacion.multiplicar(10, 5);
		//multiplicacion.setNumd1(10);
		//multiplicacion.setNumd2(5);
		double m = multiplicacion.multiplicar();
		
		System.out.println("La multiplicacion es : "+ m );
		
		//funcion Dividir
		
		Calculadora division=new Calculadora(10.0,2.0);
		//Variable d ... en la variable guardamos el llamado (el cociente)
		//double d=division.dividir(10, 2);
		//division.setDividiendo(10);
		//division.setDivisor(2);
		double d=division.dividir();
		//mostrar en consola
		System.out.println("La division es: "+ d);
		
		//funcion promediar
		
		Calculadora promedio=new Calculadora(10, 8, 9);
		
		//double p=promedio.promediar(10, 8, 9);
//		promedio.setValor1(10);
//		promedio.setValor2(8);
//		promedio.setValor3(9);
		double p=promedio.promediar();
		System.out.println("El promedio es: "+p);
		
		//funcion mostrarResultado
		Calculadora mensaje=new Calculadora("Auritas no joven, Salí al almuerzo. Regreso en 1 hora");
		//c1.setMesanje("Auritas no joven, Salí al almuerzo. Regreso en 1 hora");
		mensaje.mostrarResultado();
		
		//-------°-------evaluacion
		Calculadora evaluacion=new Calculadora(100.5,40.5);
		//double e=evaluacion.restar2(100.5, 40.5);
		//colocamos los valores de la resta, tomar en caunta que ahora utilizamos this
//		evaluacion.setNumd1(100.5);
//		evaluacion.setNumd2(40.5);
		//llamamos a la funcion restar
		double e=evaluacion.restar2();
		System.out.println("Resta double="+e);
		
		//-------°-------- evaluacion calcular descuento
		//double desc=evaluacion.calcularDescuento(200, 15);
		//agregamos valores
		Calculadora evaluacionDesc=new Calculadora(200.0,15.0);
//		evaluacionDesc.setPrecio(200);
//		evaluacionDesc.setPorcentajeDescuento(15);
		double desc=evaluacionDesc.calcularDescuento();
		System.out.println("Descuento="+desc);
	}
	
	
	

}
