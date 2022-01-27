package com.curso.colecciones;

import java.util.*;

import com.curso.interfaces.ObjetoVolador;

public class PruebasSet {
	
	
	public static void main(String[] args) {
		
		
		
		//Clase Wrapper o clase envoltorio
		//int  Integeger
		//boolean Boolean
		//char  Character
		//double Double
		//...
		Integer i = new Integer(2);
		Integer ii = 2; //autoboxin
		
		
		//SET  - NO DUPLICADOS
		Set<Integer> notas = 
				new TreeSet(); //orden NATURAL
				//new LinkedHashSet<Integer>(); // ORDEN DE INSERCION
				//new HashSet<Integer>();  //NO ORDENA
				
		notas.add(1);
		notas.add(389);
		notas.add(1);
		notas.add(39);
		notas.add(50);
		
		for(Integer n : notas) {
			System.out.println(n);
		}

		
	}
	
	
	public void aterrizaje(Set<ObjetoVolador> volables) {
		
	}
	
    public void aterrizajeOrdnado(TreeSet<ObjetoVolador> volables) {
		
	}
	
	
	
	
	

}
