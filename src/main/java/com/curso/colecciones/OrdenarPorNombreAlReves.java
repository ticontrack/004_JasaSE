package com.curso.colecciones;

import java.util.Comparator;

public class OrdenarPorNombreAlReves implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}

}
