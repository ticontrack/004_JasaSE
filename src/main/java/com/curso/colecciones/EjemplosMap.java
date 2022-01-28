package com.curso.colecciones;

import java.util.*;

public class EjemplosMap {

	public static void main(String[] args) {
		
		//MAP  guarda una coleccion de elementos
		//     en modo key - value
		
		// key - Integer  (NO DUPLICADOS)
		// Value - Empleado
		Map<Integer, Empleado> map = new HashMap();
		
		// 123  ->  Empleado 123, Luis, 123883D
		
		map.put(123, new Empleado(123,"Luis Ramos", "1234E"));
		map.put(30, new Empleado(30,"Rosa López", "33333Z"));
		map.put(3, new Empleado(3,"Carlos Etxebarria", "88245E"));
		
		Empleado e = map.get(3);
		System.out.println(e);
		
		map.put(3, new Empleado(33,"Carlota", "88245E"));
		
	   	System.out.println(map.get(3));
	   	
	   	
	   	// MAP - Hashtable, HashMap, LinkedHashMap
	   	// key  (son Set, el tipo debe tener programado
	   	//       equasls y hascode  )       
	   	
	   	// MAP - TreeMap  
	   	// key   debe implementar Comparable
		
	   	
	   	//Hashtable , HashMap
	   	
	   	Map<Punto, String> figura = new TreeMap();
	   			//new LinkedHashMap();
	   			// new HashMap();
	   
	   	figura.put(new Punto(5,0), "Red");
	   	figura.put(new Punto(0,0), "Blue");
	   	figura.put(new Punto(4,0), "Red");
	   	
	   	Set<Punto> claves = figura.keySet();
	   	for(Punto p: claves) {
	   		System.out.println(p + " color " + figura.get(p));
	   	}
	   	Collection<String> colore = figura.values();  	
	   	
	}
}
