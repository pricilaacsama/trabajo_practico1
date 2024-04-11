package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private Double salario;
	
	public static final double 	SALARIO_MINIMO = 210000.00;
	public static final double AUMENTO_POR_MERITOS = 20000.00;
	
		
		
	public Empleado(String nombre, int legajo, Double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		
		if (salario >= SALARIO_MINIMO) {
			this.salario = salario;
		} else {
			this.salario = SALARIO_MINIMO;
		}
		
	}
	
	public void mostrarDatos() {
		System.out.println("nombre del empleado: " + nombre);
		System.out.println("legajo: " + legajo);
		System.out.println("salario $: " + salario);
	}
	
	public void darAumento() {
		salario = salario + AUMENTO_POR_MERITOS;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
