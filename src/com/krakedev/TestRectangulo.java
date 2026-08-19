package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		//r1 ---> intancia de la clase Rectangulo 
		Rectangulo r1 = new Rectangulo();
		
		//Valores del metodo calcularArea. valores en los atributos, valores de la clase rectangulo
		
//		r1.base=7;
//		r1.altura=5;
		r1.setBase(7);
		r1.setAltura(5);
		
		
		//Guardamos el resultado en una variable resultadoArea, 
		
		//r1.calcularArea(); ----> metodo funcion
		
		int resultadoArea = r1.calcularArea();
		
		System.out.println("El area del rectangulo con base "+r1.getBase()+" y altura "+r1.getAltura()+" es: " + resultadoArea);
		
		//-------
		
		Rectangulo r2 = new Rectangulo();
		
//		r2.altura=8;
//		r2.base=2;
		r2.setBase(8);
		r2.setAltura(2);
		
		int resultadoArea2=r2.calcularArea();
		
		System.out.println("Area del rectangulo: "+resultadoArea2);
		
		//----------
		
		//Perimetro
		//instancia de clase rectangulo para calcular el perimetro
		Rectangulo p=new Rectangulo();
		//valores de la clase Rectangulo, para calcular el perimetro
//		p.altura=2;
//		p.base=4;
		p.setBase(4);
		p.setAltura(2);
		//Guardamos el resultado en una variable resultadoPerimetro
		
		double resultadoPerimetro;
		
		//le pasamos la instacnia creada p y llamamos al metodo perimetro
		//p.calcularPerimetro()
		resultadoPerimetro=p.calcularPerimetro();
		//mosrar en consola
		System.out.println("El perimetro es: "+resultadoPerimetro);
		
		
		
		
	}

}
