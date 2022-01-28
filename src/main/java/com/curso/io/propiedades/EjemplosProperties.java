package com.curso.io.propiedades;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class EjemplosProperties {
	
	public static void main(String[] args) {
		
		//Properties   coleccion de tipo Map
		
		Properties sistema = System.getProperties();
		
		//sistema.list(System.out);
		
		//leer los valores de textos.properties
		Properties textos = new Properties();
		
		try {
			textos.load(new FileReader("textos.properties"));
			
			//textos.list(System.out);
			System.out.println("----" + textos.get("titulo") + "------");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			System.out.println("Error cargar fichero propiedades");
		}
		
		
	}

}
