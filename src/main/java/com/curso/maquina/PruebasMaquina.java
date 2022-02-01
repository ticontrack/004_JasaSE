package com.curso.maquina;

public class PruebasMaquina {
	
	public static void main(String[] args) {
		
		
		//MAQUINA REFRESSCOS
		
		// 1. Crear una maquina con 10 tipos de refescos
		
		//Uso
		MaquinaExpendedora m = new MaquinaExpendedora();
		
		System.out.println(m.display());;
		
//		MaquinaExpendedora m = new MaquinaExpendedora(
//							Map<TiposRefresco, Refresco> refrescos,
//							double cambiosIniciales);
//		
		
		// 2. Vender  pasan el tipo de Refesco y dinero en centimos
		//      2.1  no hay ese refesco  -> VentaRefrescoException
		
		try {
			m.vender(TiposRefresco.MONSTER, 20);
		}catch(VentaRefrescoException e) {
			System.out.println(e.getMessage());
		}
				// 2.2. hay refresco pero el importe no es mayor a 0
		try {
			m.vender(TiposRefresco.COCA_COLA, 0);
			System.out.println("... en ello");
		}catch(VentaRefrescoException e) {
			System.out.println(e.getMessage());
		}
		
		   //2.3. hay refresco, importe ok, no has ingresado suficiente 
		   //2.4. hay refresco, importe ok, no hay cambios
		   //2.5. hay  ref, impo ok, no hay stock 
		
		   // 2.6. hay ref, imp ok, hay stock , hay cambios, y has ing dinero suficinte
		
		double cambios = m.vender(TiposRefresco.COCA_COLA, 400);
		
		
		// 3. Reponer
		
		// 4. Recaudar
		
		// 5. Cambios
		
		
		
	}

}
