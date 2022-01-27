package com.curso.estaticos;

public  class Factura {
	
	public void metodo1() {
		//codigo
	}
	
	public final void metod2() {
		
	}

}


class FacturaJuguetes extends Factura{
	
	@Override
	public void metodo1() {
		super.metodo1();
	}
	
	@Override
	public void metodo2() {

	}
	
	
	
}
