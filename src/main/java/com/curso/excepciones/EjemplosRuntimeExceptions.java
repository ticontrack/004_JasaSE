package com.curso.excepciones;

public class EjemplosRuntimeExceptions {

	public static void main(String[] args) {

		// Todas la excepciones que heredan de RuntimeException
		// son Unchecked Exception
		// no nos obliga el compilador a tratarlas
		
		String numero = "2"; //"dos";//"2";
		
		int numeroInt = Integer.parseInt(numero);
		
		System.out.println("El número es " + numeroInt);
		
		
		String nombre = null;
		if(nombre != null) {
			System.out.println("Nombre en mayusculas " + nombre.toUpperCase());
		}
   
		
	}

}
