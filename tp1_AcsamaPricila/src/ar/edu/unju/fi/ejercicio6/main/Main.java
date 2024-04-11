package ar.edu.unju.fi.ejercicio6.main;
import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese el nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("ingrese el Dni: ");
		String dni = scanner.nextLine();
		System.out.println("ingrese la fecha de nacimiento (YYYY-MM-DD): ");
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
		System.out.println("ingrese la provincia: ");
		String provincia = scanner.nextLine();
		//persona con constructor vacio
		
		Persona persona1 = new Persona(dni, nombre, fechaNacimiento, provincia);
		
		System.out.println("Datos de la persona1: ");
		persona1.mostrarDatos();
		System.out.println();
		
		System.out.println("ingrese el nombre: ");
		nombre = scanner.nextLine();
		System.out.println("ingrese el DNI: ");
		dni = scanner.nextLine();
		System.out.println("ingrese la fecha de nacimiento (YYYY-MM-DD): ");
		fechaNacimiento = LocalDate.parse(scanner.nextLine());
		System.out.println("ingrese la provincia: ");
		provincia = scanner.nextLine();
		//persona con parametros  //
		Persona personaParametros = new Persona(dni, nombre, fechaNacimiento, provincia);
		System.out.println("Datos de la 2da persona creado con parametros: ");
		personaParametros.mostrarDatos();
		System.out.println();

		System.out.println("ingrese el nombre: ");
		nombre = scanner.nextLine();
		System.out.println("ingrese el DNI: ");
		dni = scanner.nextLine();
		System.out.println("ingrese la fecha de nacimiento (YYYY-MM-DD): ");
		fechaNacimiento = LocalDate.parse(scanner.nextLine());
		
		Persona personaConDatos = new Persona(dni, nombre, fechaNacimiento);
		//persona con parametro menos provincia pq ya tiene un valor asignado//
		System.out.println("Datos de la 3ra persona creada con parametros menos provincia: ");
		personaConDatos.mostrarDatos();
		
		scanner.close();
	}

}
