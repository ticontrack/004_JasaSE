package com.curso.excepciones;

import java.io.File;
import java.io.IOException;

public class EjemplosExcepcionesChecked {
	
	public static void main(String[] args) {
		
		//Uso File que lanza un IOException 
		
		File fichero = new File("carta.txt");
		//crear fichero

		try {
			fichero.createNewFile();
			//aqui todo ok
			System.out.println("Creo el fichero ok");
		} catch (IOException e) {
			//aqui si ha ocurrido una IOException
			System.out.println("No se pudo crear el fichero");
			
			e.getMessage();
			e.printStackTrace();	
		}
		System.out.println("..... aqui sigue ");
			
		
		
		
	}//fin
	
	
	

}
