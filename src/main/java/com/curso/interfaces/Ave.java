package com.curso.interfaces;

public class Ave extends Animal implements ObjetoVolador {

	@Override
	public void volar() {
		System.out.println("Vuelo con alas");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterrizo con mis patas como un ave");
	}

	@Override
	public void despegar() {
		System.out.println("Despego como un ave");
	}

	@Override
	public void solicitarViaje() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		System.out.println("Como gusanos.......");
	}

}
