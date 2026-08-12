package com.krakedev;

public class PlatoTest {

	public static void main(String[] args) {
		
		//Crear 3 variables de tipo Plato,
		
		Plato platoA=new Plato();
		Plato platoB=new Plato();
		Plato platoC=new Plato();
		
		//Instanciar 3 objetos y referecniarlos a las variables
		//Modificar los atributos
		platoA.nombre="Pastel de chocolate";
		platoA.tipo="Postre";
		platoA.precio=2.50;
		platoA.disponible=true;
		
		platoB.nombre="Bolonesa";
		platoB.tipo="fuerte";
		platoB.precio=5.00;
		platoB.disponible=true;
		
		platoC.nombre="pan de ajo";
		platoC.tipo="Entrada";
		platoC.precio=2.00;
		platoC.disponible=true;
		
		System.out.println("### Plato A ###");
		System.out.println("Nombre:"+ platoA.nombre);
		System.out.println("Tipo:"+platoA.tipo);
		System.out.println("Precio: "+platoA.precio);
		System.out.println("Disponible: "+platoA.disponible);
		System.out.println(" ");
		System.out.println("### Plato B ###");
		System.out.println("Nombre:"+ platoB.nombre);
		System.out.println("Tipo:"+platoB.tipo);
		System.out.println("Precio: "+platoB.precio);
		System.out.println("Disponible: "+platoB.disponible);
		System.out.println(" ");
		System.out.println("### Plato C ###");
		System.out.println("Nombre:"+ platoC.nombre);
		System.out.println("Tipo:"+platoC.tipo);
		System.out.println("Precio: "+platoC.precio);
		System.out.println("Disponible: "+platoC.disponible);
		
		
	}

}
