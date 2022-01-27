package com.curso.interfaces;

public interface ObjetoVolador {
	
	//constantes estátias  public static final
	
	public static final double ALTURA_MAXIMA_VUELO = 200.9;
	
	
	//todos son public abstract lo ponga o no
	public abstract void volar();
	public void aterrizar();
	void despegar();

}
