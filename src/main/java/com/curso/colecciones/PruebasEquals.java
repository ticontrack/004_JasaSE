package com.curso.colecciones;

public class PruebasEquals {
	
	public static void main(String[] args) {
		
		Punto p1 = new Punto(1,2);
		Punto p2 = new Punto(1,2);
		Punto p3 = p1;
		
		// operador == se usa para comparar tipos primitivos
		// el método equals se usa par comparar objetos
		
		System.out.println("p1 == p2 " + (p1 == p2)); //false
		System.out.println("p1.equals(p2) " + (p1.equals(p2))); //true
		
		
		System.out.println("p1 == p3 " + (p1 == p3)); //true
		System.out.println("p1.equals(p3) " + (p1.equals(p3))); //true
		
		
		
		
		
	}

}
