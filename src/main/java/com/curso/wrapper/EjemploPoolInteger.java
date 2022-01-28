package com.curso.wrapper;

public class EjemploPoolInteger {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 2;
		
		System.out.println("a == b " + (a == b));
		
		//pool -128 al 127 (byte)
		Integer a1 = 332; // 2;
		Integer b1 = 332; //2;
		Integer c1 = new Integer(332);
		
		System.out.println("a1 == b1 " + (a1 == b1)); //false
		System.out.println("a1.equals(b1) " + (a1.equals(b1))); //false
		
		System.out.println("a1 == c1 " + (a1 == c1));
		
		
		if( a1 == 332){ //ok  porque a1 lo convierte en int
			
		}
		
		if(a1.equals(332)) { //ok porque convier 332 en un obj Integer
			
		}
		
		String nombre = "Luis";
		
		if( nombre.equals("Luis")) { //ok   
			
		}
		
		// if nombre == "Luis"  mal
		
		
		
	}

}
