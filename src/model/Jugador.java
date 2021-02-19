package model;

import java.io.Serializable;

public class Jugador implements Serializable {
	
	private String nombre;
	private String contrasena;
	
	
	public Jugador(String nombre, String contrasena) {
		
		this.nombre = nombre;
		this.contrasena = contrasena;

	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
