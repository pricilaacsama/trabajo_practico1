package ar.edu.unju.fi.ejercicio6.model;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}
	

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.fechaNacimiento, fechaActual);
		return periodo.getYears();
	}
	
	public boolean verificarMayor() {
		if (calcularEdad()>= 18)
			return true;
		else 
		return false;
	}
	
	public void mostrarDatos() {
		System.out.println("dni: " + dni);
		System.out.println("nombre: " + nombre);
		System.out.println("fecha de nacimiento: " + fechaNacimiento);
		System.out.println("provincia: " + provincia);
		int edad = calcularEdad();
		System.out.println("edad: " + edad);
		
		if (edad >= 18) {
			System.out.println("la persona es mayor de edad");
		} else {
			System.out.println("la persona no es mayor de edad");
		}
		
	}

	
	
	
	
}
