package com.krakedev;

public class PlatoTest {

	public static void main(String[] args) {
		
		//Crear 3 variables de tipo Plato,
		//Se modifica con metodo constructor  TALLER: DOMINIO DE CONSTRUCTORES 19/08/2026
		
		Plato platoA=new Plato("Pastel de chocolate",true);
		Plato platoB=new Plato("Bolonesa","fuerte",5.00);
		Plato platoC=new Plato(true);
		
		//Instanciar 3 objetos y referecniarlos a las variables
		//Modificar los atributos
//		platoA.nombre="Pastel de chocolate";
//		platoA.tipo="Postre";
//		platoA.precio=2.50;
//		platoA.disponible=true;
		//
		//platoA.setNombre("Pastel de chocolate");
		platoA.setTipo("Postre");
		platoA.setPrecio(2.50);
		//platoA.setDisponible(true);
		
		
//		platoB.nombre="Bolonesa";
//		platoB.tipo="fuerte";
//		platoB.precio=5.00;
//		platoB.disponible=true;
		
		//platoB.setNombre("Bolonesa");
		//platoB.setTipo("fuerte");
		//platoB.setPrecio(5.00);
		platoB.setDisponible(true);
		
//		platoC.nombre="pan de ajo";
//		platoC.tipo="Entrada";
//		platoC.precio=2.00;
//		platoC.disponible=true;
		
		platoC.setNombre("pan de ajo");
		platoC.setTipo("Entrada");
		platoC.setPrecio(2.00);
		//platoC.setDisponible(true);
		
		System.out.println("### Plato A ###");
		System.out.println("Nombre:"+ platoA.getNombre());
		System.out.println("Tipo:"+platoA.getTipo());
		System.out.println("Precio: "+platoA.getPrecio());
		System.out.println("Disponible: "+platoA.isDisponible());
		System.out.println(" ");
		System.out.println("### Plato B ###");
		System.out.println("Nombre:"+ platoB.getNombre());
		System.out.println("Tipo:"+platoB.getTipo());
		System.out.println("Precio: "+platoB.getPrecio());
		System.out.println("Disponible: "+platoB.isDisponible());
		System.out.println(" ");
		System.out.println("### Plato C ###");
		System.out.println("Nombre:"+ platoC.getNombre());
		System.out.println("Tipo:"+platoC.getTipo());
		System.out.println("Precio: "+platoC.getPrecio());
		System.out.println("Disponible: "+platoC.isDisponible());
		
		
	}

}
