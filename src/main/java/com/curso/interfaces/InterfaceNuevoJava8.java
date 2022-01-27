package com.curso.interfaces;

public interface InterfaceNuevoJava8 {
	
	
	//solo a partir de Java 8
	
	//static methods
	// Uso:     InterfaceNuevoJava8.saluda("");
	public static void saluda(String nombre ) {
		System.out.println("Hola Interfaz JAva 8: " + nombre);
	}

	// default method
	// Uso:    a.print()  donde a es una var ref de una clase
	//                     que implementa el Interfaz InterfaceNuevoJava8
    public default void print() { 
      System.out.println("TestInterface :: Default method"); 
    } 

}
