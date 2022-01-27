package com.curso.estaticos;

public class PruebaStatic2 {
	
	public static void main(String[] args) {
		
		
	//	Contador4.getContador();
		
		//ya no podemos usar asi contador
		//Contador2.contador = 3;
		//System.out.println("Contador inicial es " + Contador2.contador);
		
		
		Contador2 c1 = new Contador2();
		System.out.println("contador vale " + c1.getContador());
		
		System.out.println("Contador vale " + Contador2.getContador());

		saluda();
		
		
		
		
	}
	
	public static void saluda() {
		
	}
	

}
