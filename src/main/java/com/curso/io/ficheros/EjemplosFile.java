package com.curso.io.ficheros;

import java.io.*;

public class EjemplosFile {
	
	
	public static void main(String[] args) throws IOException {
		
		////crer directorio
		File dir2 = new File("dir1");
		dir2.mkdir();
	
		//crer directorio
		File dir = new File("correspondencia");
		dir.mkdir();
		
		//crear fichero
		File carta = new File(dir, "carta2.txt");
		carta.createNewFile();
		
		//Escribir
		
		PrintWriter out
        = new PrintWriter(new FileWriter(carta,true));
		
		out.println("Querido Amigo2:");
		out.println("Espero que a la recepcion de esta carta sigas bien.");
		
		out.close();
		
		
		//leer
		
		BufferedReader in
	       = new BufferedReader(new FileReader(carta));
		
		String linea;
		do {
			linea = in.readLine();
			System.out.println(linea);
		}while(linea != null);
		
		in.close();
	}

}
