package com.curso.colecciones;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
	
	private int id;
	private String nombre;
	private String dni;
	
	
	public Empleado(int id, String nombre, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return id == other.id;
	}


	@Override
	public int compareTo(Empleado otro ) {
		
		return this.id - otro.id;
	}


	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
	
	
	

}
