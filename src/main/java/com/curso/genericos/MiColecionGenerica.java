package com.curso.genericos;

import com.curso.colecciones.Empleado;

public class MiColecionGenerica<E> {
	
	private E valor;
	
	public MiColecionGenerica(E valor) {
		this.valor = valor;
	}
	public E getValor() {
		return valor;
	}
}

class Empresa{
	
	private MiColecionGenerica<Empleado> empleado;
	private MiColecionGenerica<String> otra;
	
	public void hazAlgo() {
		empleado = new MiColecionGenerica(new Empleado(1,"Luis","A222"));
		otra = new MiColecionGenerica<String>("Hola");
		
	}
	
}