package com.curso.colecciones;

import java.util.*;

public class PruebaList {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Begoña"); //0
		lista.add("Maria");   //1
		//lista.add(5,"Pedro"); //.IndexOutOfBoundsException
		lista.add(2,"Pedro");
		
		lista.add(1,"Carlos");
		
		for(String s : lista) {
			System.out.println(s);
		}
		
		System.out.println("Dame el primero " + lista.get(0));
		
		lista.sort(new OrdenarPorNombreAlReves());
		
		for(String s : lista) {
			System.out.println(s);
		}
	}
	
}
