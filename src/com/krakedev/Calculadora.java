package com.krakedev;

public class Calculadora {
	
	private int num1;
	private int num2;
	//DOUBLE
	private double numd1;
	private double numd2;
	//Funcion dividir
	private double dividiendo;
	private double divisor;
	//funcion promediar
	private double valor1;
	private double valor2;
	private double valor3;
	//Evaluacion examen desdpues de llegar al 30% del curso POO
	private double precio;
	private double porcentajeDescuento;
	//Funcion mostarrResultado
	private String mesanje;
	
	//metodo constructor parametros suma y resta 
	public Calculadora( int num1,  int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	//metodo constructor parametros double --- multiplicacion, division, restaDouble, descuento
		public Calculadora( double numd1,  double numd2) {
			this.numd1 = numd1;
			this.numd2 = numd2;
			//division
			this.dividiendo = numd1;
			this.divisor = numd2;
			//descuento
			this.precio=numd1;
			this.porcentajeDescuento=numd2;
			
		}
	//metodo constructor parametros promediar 
		public Calculadora( double valor1,  double valor2,  double valor3) {
			
			this.valor1 = valor1;
			this.valor2 = valor2;
			this.valor3 = valor3;
		}
		//metodo constructor parametros  -	mesanje
		public Calculadora(String mesanje) {
			this.mesanje = mesanje;
		}
	
	
	//--GET AND SET
	
	public String getMesanje() {
		return mesanje;
	}
	public void setMesanje(String mesanje) {
		this.mesanje = mesanje;
	}
	public double getNumd1() {
		return numd1;
	}
	public void setNumd1(double numd1) {
		this.numd1 = numd1;
	}
	public double getNumd2() {
		return numd2;
	}
	public void setNumd2(double numd2) {
		this.numd2 = numd2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	//get and set -- dividir
	public double getDividiendo() {
		return dividiendo;
	}
	public void setDividiendo(double dividiendo) {
		this.dividiendo = dividiendo;
	}
	public double getDivisor() {
		return divisor;
	}
	public void setDivisor(double divisor) {
		this.divisor = divisor;
	}
	//get set --- promediar

	public double getValor1() {
		return valor1;
	}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	public double getValor2() {
		return valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	public double getValor3() {
		return valor3;
	}
	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}
	
	//get and set --- funcion calculara descuento 

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	public int sumar() {
		
		int resultado;
		resultado=num1+num2;
		
		return resultado;
	}
	
	//------
	public int restar() {
		int resultado;
		resultado=num1-num2;
		
		return resultado;
	}
	
	
	//evalucacion restar, double
	public double restar2() {
		double resultado;
		resultado=numd1-numd2;
		
		return resultado;
	}
	
	//Función: multiplicar
	
	public double multiplicar() {
		double result;
		
		result =numd1*numd2; 
		return result;
	}
	
	//Funcion dividir
	
	
	public double dividir() {
		double result;
		
		result =dividiendo/divisor; 
		return result;
	}
	
	//Funcion Promediar
	
	
	public double promediar() {
		double result;
		
		result =(valor1+valor2+valor3)/3;
		return result;
	}
	
	//Funcion mostarrResultado
	
	
	
	public void mostrarResultado() {
		System.out.println(mesanje); 
	}
	
	
	//Evaluacion examen despues de llegar al 30% del curso POO
	//funcion descuento
	
	
	public double calcularDescuento() {
		double result;
		
		result=precio-(precio*porcentajeDescuento/100);
		
		return result;

	}

}
