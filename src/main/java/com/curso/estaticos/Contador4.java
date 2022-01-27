package com.curso.estaticos;

public class Contador4 {
	
	//atritubo de clase
	private static int contador;
	
	//bloque estatico para inicializar vari de clase
	// se ejecuta solo una vez en la carga de la clase
	static {
		//ExceptionInInitializerError
		//String s = null;
		//s.toLowerCase();
		
		contador = 10; // AppParameters.getParam("contador");
	}

	
	//atributo - variables de instancia
	private int serialNumber;
	
	public Contador4() {
		contador ++;
		serialNumber = contador;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public static int getContador() {
		return contador;
	}
	
}
