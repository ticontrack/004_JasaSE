package com.curso.io.escaner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class EjemploScanner {
	
	public static void main(String[] args) {
		
		// Tratar datos entran desde teclado
         Scanner sc = new Scanner(System.in);
         //locale   - código del idioma region del sistema
         // 40,4   - ES
         // 40.4   - EU
         
         Locale italia = new Locale("IT");
         Locale canada = new Locale("FR", "CA");
         
        // sc.useLocale(canada);
       //  sc.useDelimiter("#");
         
         sc.useLocale(Locale.ENGLISH);
         
//         System.out.print("Introduce dato: ");
//        // String dato = sc.next(); //lea dato 
//         double dato = sc.nextDouble();
//         System.out.println("Has puesto " + dato);
         
		//Tratar una cadena
         
         // por defeco locale es el del sistema ES   30,9
         String cadenaDatos = "1 Begoña 30,9";
         
         Scanner sc2 = new Scanner(cadenaDatos);
         int id = sc2.nextInt();  //1
         String nombre = sc2.next();  //Begoña
         double peso = sc2.nextDouble(); // 30,9
         
     //    System.out.printf("%d %s %5.2f" , id, nombre, peso);
		
		//Tratar datos entrar desde un fichero
         
         try {
			
        	 Scanner scf = new Scanner(new FileReader("textos.properties"));
			scf.useDelimiter("\n");
			while(scf.hasNext()){
				System.out.println(scf.next());
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			e.printStackTrace();
		}
         
         
		
	}

}
