package com.curso.colecciones;

import java.util.*;

public class PruebaSetPunto {
	
	public static void main(String[] args) {
		
		// Colleccion de tipo Set (HashSet) de puntos
		
		Set<Punto> figura = new  TreeSet<Punto>(new OrdenarPuntoAlReves());
				//new TreeSet<Punto>();
			  //	new LinkedHashSet<Punto>();
		      // new HashSet();
		//añadir varios puntos
		
		figura.add(new Punto(0,0));
		figura.add(new Punto(1,0));
		figura.add(new Punto(0,3));
		figura.add(new Punto(2,1));
		figura.add(new Punto(1,2));
		
		//añadir un punto que se repita
		figura.add(new Punto(2,1));
		
		//recorrer 
		for(Punto p : figura) {
			System.out.println(p);
		}
		
		// ¿qué pasa?
		/* permite tener dos puntos con las mismas coordenada
		    Punto [x=2, y=1]
			Punto [x=2, y=1]
			Punto [x=0, y=3]
			Punto [x=1, y=0]
		 */
		
		
		
	}

}
