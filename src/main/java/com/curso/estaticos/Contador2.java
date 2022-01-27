package com.curso.estaticos;

public class Contador2 {
	
	//atritubo de clase
	private static int contador = 0;
	
	//atributo - variables de instancia
	private int serialNumber;
	
	public Contador2() {
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
