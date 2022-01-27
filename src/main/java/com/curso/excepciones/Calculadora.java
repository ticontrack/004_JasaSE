package com.curso.excepciones;

public class Calculadora {
	
	public static double divide(int n1, int n2) throws CalculadoraException {
		double r = 0;
		
		if( n2 <= 0 ) {
			//no puedo dividir
			//throw new IllegalArgumentException("No pude dividir.Divisor debe ser positivo"); 
			//Nota: IllegalArgumentException es hija  RuntimeException
			
			//es checked
		//	throw new Exception("No pude dividir.Divisor debe ser positivo");
			throw new CalculadoraException("Divisor debe ser positiovo", true);
		}
		r= n1 /n2;
		return r;
	}

}
