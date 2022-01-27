package com.curso.estaticos;

public class PruebaStatic {
	
	public static void main(String[] args) {
		
		// JAVA CARGA LAS CLASES A MEDIDA QUE LAS VA NECESITANDO
		
		System.out.println("Contador inicial es " + Contador.contador);
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		Contador c4 = new Contador();
		
		System.out.printf( " serialNumber %d , contaro %d %n" , c1.getSerialNumber(), Contador.contador);
		
		Contador.contador = 300;
		Contador c5 = new Contador();
		
		System.out.printf( " serialNumber %d , contaro %d %n" , c5.getSerialNumber(), Contador.contador);
		
	}

}
