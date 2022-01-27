package com.curso.enumeraciones;

public class Juego {
	
	public static void main(String[] args) {
		
		Palos p = Palos.BASTOS;
		
		if( p == Palos.OROS) {
			System.out.println("son oros");
		}
		
		System.out.println(" name " + p.name());  // PALOS
		System.out.println(" ordinal " + p.ordinal()); //2  , posicion en la enumeracion empiea por 0
		System.out.println(" valores " + Palos.values());  //array con todos lo elemento de la enumeracion
		
		for(Palos pa : Palos.values()) {
			System.out.println(pa);
		}
		
		
	}

}
