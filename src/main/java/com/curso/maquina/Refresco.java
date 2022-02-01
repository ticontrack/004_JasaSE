package com.curso.maquina;

/**
 * Modela un carril de refrescos del mismo tipo en una 
 * maquina expendedora.
 * 
 * Los refrescos se venden al doble de su coste
 * 
 * @author begonaolea
 * @version 1
 */
public class Refresco {

	public static final int NUM_MAX_REFRESCOS = 15;

	private TiposRefresco tipo;
	private double precio ;
	private int stock;
	
	//constructor
	public Refresco(TiposRefresco tipo) {
		this.tipo = tipo;
		this.precio = tipo.getCoste() * 2;
		this.stock = NUM_MAX_REFRESCOS;
	}

	//getters
	
	public TiposRefresco getTipo() {
		return tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public String toString() {
		return "Refresco [tipo=" + tipo + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	public void sacarRefresco() throws VentaRefrescoException {
		//validar que hay sino lanzo Excepcion
		if(this.stock == 0) {
			throw new VentaRefrescoException("No hay stock del refersco " 
						+ this.tipo.getNombre());
		}
		this.stock --;
	}

	
	
	
}
