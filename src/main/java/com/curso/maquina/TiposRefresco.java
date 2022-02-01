package com.curso.maquina;

public enum TiposRefresco {
	
	COCA_COLA("Coca-cola", 0.50), PEPSI("Pepsi", 0.45),
	MONSTER("Monster", 1.00),NESTEA("Nestea", 0.60),
	REDBULL("RedBull", 1.20),AQUARIUS("Aquarius", 0.50),
	FANTA_NARANJA("Fanta Naranja", 0.50),COCA_COLA_ZERO("Coca-Cola Zero", 0.50),
	BURN("Burn", 0.50),KAS_LIMON("Kas Limon", 0.50);
	
	private String nombre;
	private double coste;
	
	//CONSTRUCTOR
	private TiposRefresco(String nombre, double coste) {
		this.nombre = nombre;
		this.coste = coste;
	}
	
	//GETTERS/SETTERS
	public String getNombre() {
		return nombre;
	}
	
	public double getCoste() {
		return coste;
	}

}
