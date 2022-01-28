package com.curso.genericos;

public class TallerGenerico<E extends Vehiculo> {
	 public void reparar(E vehiculo) {
		 vehiculo.verMotor();
	 }	
	 
	 public static void main(String[] args) {
		TallerGenerico<Vehiculo> taller = new TallerGenerico<Vehiculo>();
		taller.reparar(new Coche());
		//taller.reparar(new Avion());
		
		TallerGenerico<Coche> tallerCoches = new TallerGenerico<Coche>();
		tallerCoches.reparar(new Coche());
		//tallerCoches.reparar(new Todoterreno());
	} 
}

abstract class Vehiculo {
	public abstract void verMotor();
}

class Coche extends Vehiculo{

	@Override
	public void verMotor() {
		System.out.println("Motor diesel");
	}
	
	public void tocaClaxon() {
		System.out.println("piiii piiii");
	}
}