package com.curso.string;

public class EjemplosString {

	public static void main(String[] args) {
		
           // String - INMUTABLE
		   //        - COMPARAR USANDO equals - NO ==
		   //        - POOL Strings
		
		
		   String nombre = "Luis";
		   String nombre2 = "Luis";
		   String nombre3 = new String("Luis");
		   
		   
		   //COMPARACION  OBJ SIEMPRE SE COMPARAR CON equals
		   
		   // == 
		   if( nombre == nombre2) {
			   System.out.println("NOMBRE Y NOMBRE2 SON IGUALES");
		   }
		   if( nombre == nombre3) {
			   System.out.println("SON IGUALES");
		   } else {
			   System.out.println("nombre 3 es DISTINTO");
		   }
		   
		   if( nombre.equals(nombre3)) {
			   System.out.println("nombre y nombre 3  SON IGUALES");
		   }
		   
		   
		   
		   
		   //INMUTABLE   (String , Wrapper  Integer,Double, ...)
		  // nombre.toUpperCase();
		   
		   
		   nombre =  nombre.toUpperCase(); //no cambia su estado Luis
		   nombre = nombre.concat(" Ramos");
		   System.out.println(nombre);

		   //si voy a trabajar mucho con concatenazión, etc usar :
		    StringBuilder sb; //ThreadSave
		    StringBuffer sbf ; //
		    
		    sb = new StringBuilder("Luis");
		    sb.append(" Ramos");
		    
		    System.out.println(sb);
		    
		    
		    
		   
		   
		   
		

	}

}
