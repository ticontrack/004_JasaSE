package com.curso.estaticos;

public class Nomina {
	
	private static final double  IRPF_MINIMO  = 2.4;

	
	//atr
	private double salario;
	
	
	//const
	
	//metodos
	
	public double calculaIRPF() {
		double irpf = salario  * (IRPF_MINIMO / 100.0 );
		return irpf;
	}
	
	public  void imprimirNomina() {
		
		System.out.println("salario " + this.salario);
		System.out.println("irpf " + calculaIRPF());
	}
	
}
