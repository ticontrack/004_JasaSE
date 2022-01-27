package com.curso.interfaces;

public class SuperMan implements ObjetoVolador{

	@Override
	public void volar() {
		System.out.println("Vuelo con una capa.");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterrizo como superman.");
	}

	@Override
	public void despegar() {
		System.out.println("Despego como superman");
	}

}
