package com.curso.excepciones;

public class CalculadoraException  extends Exception{

//	public CalculadoraException(String message, Throwable cause) {
//		super(message, cause);
//		
//	}
	
	private boolean denominadorMal = false;

	public CalculadoraException(String message, boolean denominadorMal) {
		super(message);
		this.denominadorMal = denominadorMal;
	}

	public boolean isDenominadorMal() {
		return denominadorMal;
	}

}
