package com.curso.excepciones;

public class GenerarNominasService {
	
	public void generaNomina(int salario, int meses) throws Exception {
		// try catch  o throws 
		// capturo y trato la excepcion
		 //o propago la excepcion
		double base = Calculadora.divide(salario, meses);
		System.out.println("Nomina es " + base);
		
	}
	
	public static void main(String[] args) {
		GenerarNominasService service = new GenerarNominasService();
		try {
			//ok
			service.generaNomina(2000, 6);
			//ko
			service.generaNomina(2000, -6);
		}catch(CalculadoraException e ) {
			//e.getMessage()
			if(e.isDenominadorMal()) {
				System.out.println(" ... No pudo dividir. Denominador Mal");
			}else {
				System.out.println(" ... No pudo dividir. Numerador Mal");
			}
		}catch(Exception e) { // cualqueir excepcion disitna de CalculadoraException
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
