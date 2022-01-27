package com.curso.interfaces;

public class Pruebas {

	public static void main(String[] args) {
		
		Animal a = new Ave();
		ObjetoVolador b = new SuperMan();//new Ave();
		
       // b.volar();
        hacerVolar(new Ave(), new SuperMan(), b);
		
        
       double altura = ObjetoVolador.ALTURA_MAXIMA_VUELO;
       
        
	}
	
	public static void hacerVolar(ObjetoVolador... voladores) {
		for(ObjetoVolador ov : voladores) {
            //si es un ave le doy de comer antes
			if( ov instanceof Ave) {
				((Ave)ov).comer();
				
				Ave a = (Ave)ov;
				a.comer();
				
			}
			ov.volar();
			
		}
	}
	
}
