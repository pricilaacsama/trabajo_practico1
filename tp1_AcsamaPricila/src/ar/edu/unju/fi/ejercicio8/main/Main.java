package ar.edu.unju.fi.ejercicio8.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un valor numerico: ");
		int n = scanner.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial(n);
		
		long sumatoria = calculadora.calcularSumatoria();
		System.out.println("la sumatoria es: " + sumatoria);
		
		
		long productoria = calculadora.calcularProductoria();
		System.out.println("la productoria es: " + productoria);
		
		scanner.close();
		//me sale mal la productoria revisar manana;
		


	}

}
