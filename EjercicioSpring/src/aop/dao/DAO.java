package aop.dao;

import org.springframework.stereotype.Component;
@Component
public class DAO {

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private String nombre;
	private String apellido;
	public String frase()
	{
		return "Saludos!" + "\n" + nombre + " " + apellido;
	}
}
