package com.krakedev;

public class Calculadora {
	
	public int sumar(int a, int b) {
		
		int resultado;
		resultado=a+b;
		
		return resultado;
	}
	
	public int restar(int a, int b) {
		int resultado;
		resultado=a-b;
		
		return resultado;
	}
	
	//Función: multiplicar
	
	public double multiplicar(double valor1, double valor2) {
		double result;
		
		result =valor1*valor2; 
		return result;
	}
	
	//Funcion dividir
	
	public double dividir(double dividiendo, double divisor) {
		double result;
		
		result =dividiendo/divisor; 
		return result;
	}
	
	//Funcion Promediar
	
	public double promediar(double valor1, double valor2,  double valor3) {
		double result;
		
		result =(valor1+valor2+valor3)/3;
		return result;
	}
	
	//Funcion mostarrResultado
	
	public void mostrarResultado() {
		System.out.println("Ahoritas no joven, Salí al almuerzo. Regreso en 1 hora"); 
	}
	

}
