package com.curso.colecciones;

import java.util.Comparator;

public class OrdenarPuntoAlReves 
		implements Comparator<Punto>{

	@Override
	public int compare(Punto o1, Punto o2) {
		// comparo x  y luego por y
		int res = 0;
		res = o2.getX() - o1.getX();
		if( res == 0) {
			res = o2.getY() - o1.getY();
		}
		return res;
	}
}