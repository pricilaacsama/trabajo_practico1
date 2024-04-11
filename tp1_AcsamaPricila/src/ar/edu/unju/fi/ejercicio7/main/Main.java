package ar.edu.unju.fi.ejercicio7.main;
import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese nombre del empleado: ");
		String nombre = scanner.nextLine();
		System.out.println("ingrese el legajo del empleado: ");
		int legajo = scanner.nextInt();
		System.out.println("ingrese el salario del empleado: ");
		Double salario = scanner.nextDouble();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		//mostrar datos del empleado antes de el aumento del salario;
		System.out.println("Datos del empleado: ");
		empleado.mostrarDatos();
		
		//dar un aumento al salario;
		empleado.darAumento();
		
		//mostrar datos del empleado despues del aumento;
		System.out.println("Datos del empleado despues del aumento: ");
		empleado.mostrarDatos();
		
		scanner.close();
		


	}

}
