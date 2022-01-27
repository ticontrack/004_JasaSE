package com.curso.interfaces;

public class PruebaInterfaceJava8 {

	
	public static void main(String[] args) {
		InterfaceNuevoJava8.saluda("Laura");
		
		MiClase c = new MiClase();
		c.print();
	}
}

class MiClase implements InterfaceNuevoJava8{
	
}
