package ar.edu.unju.fi.ejercicio12.main;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese la fecha de nacimiento (dd/mm/yyyy) ");
		System.out.println("ingrese el anio de nacimiento:");
		int anio = scanner.nextInt();
		System.out.println("ingrese el mes de nacimiento (1-12):");
		int mes = scanner.nextInt()-1;
		System.out.println("ingrese el dia de nacimiento:");
		int dia = scanner.nextInt();
		
		Calendar fechaNac = Calendar.getInstance();
		fechaNac.set(anio, mes, dia);
		
		
		Persona persona = new Persona(nombre, fechaNac);
		System.out.println("Datos de la persona: ");
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Fecha de nacimiento: " + dia + "/"+(mes+1)+"/"+anio);
		System.out.println("Edad: " + persona.calcularEdad() + " anios");
		System.out.println("Signo del zodiaco: " + persona.determinarZodiaco());
		System.out.println("Estacion del anio: " + persona.determinarEstacion());
		scanner.close();
		
		
	}

}
