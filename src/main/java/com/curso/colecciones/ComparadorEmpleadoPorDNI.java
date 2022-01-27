package com.curso.colecciones;

import java.util.Comparator;

public class ComparadorEmpleadoPorDNI
 		implements Comparator<Empleado>{

	@Override
	public int compare(Empleado o1, Empleado o2) {
		
		return o1.getDni().compareTo(o2.getDni());
	}

}
