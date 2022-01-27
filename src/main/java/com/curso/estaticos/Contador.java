package com.curso.estaticos;

public class Contador {
	
	//atritubo de clase
	public static int contador = 0;
	
	//atributo - variables de instancia
	private int serialNumber;
	
	public Contador() {
		contador ++;
		serialNumber = contador;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
}
