package com.curso.colecciones;

import java.util.Objects;

public class Punto 
       implements Comparable<Punto> {
	
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	//sobreescribir equals
	
	
	@Override
	public int hashCode() {
		System.out.println("..... hashCode ");
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("..... equals ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return x == other.x && y == other.y;
	}

	/**
	 * 0 si son iguales
	 * negativo si soy menor 
	 * positivo si soy mayor
	 */
	@Override
	public int compareTo(Punto otro) {
		// comparo x  y luego por y
		int res = 0;
		res = x - otro.x;
		if( res == 0) {
			res = y - otro.y;
		}
		return res;
	}

	

}
