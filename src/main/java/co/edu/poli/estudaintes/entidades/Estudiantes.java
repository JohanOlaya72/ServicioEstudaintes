package co.edu.poli.estudaintes.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudiantes {
   
	@Id
	private Long Identificacion;
	private String Nombres;
	private String apellidos;
	private String correo;
	
	
	
	public Estudiantes() {
	}



	public Long getIdentificaion() {
		return Identificacion;
	}



	public void setIdentificaion(Long identificaion) {
		Identificacion = identificaion;
	}



	public String getNombres() {
		return Nombres;
	}



	public void setNombres(String nombres) {
		Nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
