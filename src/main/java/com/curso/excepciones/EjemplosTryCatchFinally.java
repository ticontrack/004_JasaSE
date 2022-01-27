package com.curso.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemplosTryCatchFinally {
	
	public static void main(String[] args) {
		
		try {
			File f = null;// new File("cartas.txt");
			f.createNewFile();
			// mas código
			System.out.println("llego aqui y creo carta");
		}catch(FileNotFoundException e) {
			System.out.println("fichero no encontrado");
		}catch(IOException e) {
			System.out.println("Error al escribir/leer");
		}catch(Exception e) {
			System.out.println("Error inexperado");
			e.printStackTrace();
			return; 
		}finally {
			System.out.println("SIempre me ejecuto ocurra o no la excepcion");
			System.out.println("Incluso si haces un return o throw new Exeption");
		}
	
		System.out.println("Fin...........");
		
		
	}
	
//	public void calculaNomina(String id, double categoria) {
//		// abres conexion
//		try {
//			//validar id
//			if(id == null || service.getEmpleadoPorId(id) == null) {
//				throw new NominaException("Id noexiste");
//			}
//			//validar categoria
//			
//			//codigo
//			
//		
//		}finally {
//			//cierrro conexion
//		}
//	}
	
	
	

}
