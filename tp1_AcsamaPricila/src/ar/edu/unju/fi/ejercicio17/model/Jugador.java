package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

//import java.util.Date;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private String nacionalidad;
	private Double estatura;
	private Double peso;
	private String posicion;
	
	
	public Jugador(String nombre, String apellido, LocalDate fechaNac, String nacionalidad, Double estatura, Double peso,
			String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}
	
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNac, fechaActual);
		int edad = periodo.getYears();
		
		if (fechaActual.isBefore(fechaNac.plusYears(edad))) {
			edad--;
	    }
	    return edad;
	}
	    
		
	
	
	public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaNac);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Peso: " + peso);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + calcularEdad() + " años");
    }
	
	
	
	
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
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Double getEstatura() {
		return estatura;
	}
	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	
	
}
