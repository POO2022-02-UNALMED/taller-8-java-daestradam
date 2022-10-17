package futbol;

import java.lang.Comparable;

public abstract class Futbolista implements Comparable<Futbolista> {
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
	
	public Futbolista() {
		this("Maradona",30,"delantero");
	}
	
	@Override
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
	}
	
	@Override
	public int compareTo(Futbolista o) {
		if(this.equals(o)) {
			return 0;
		} else {
			return 1;
		}
		
	}
	
	public boolean equals (Futbolista f) {
		if(this.compareTo(f)==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public abstract boolean jugarConLasManos();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
	
	
}
