package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero: ");
		int numero = scanner.nextInt();
		
		while (numero < 1 || numero > 9) {
			System.out.println("Debe ingresar un numero entre 1 y 9:");
			numero = scanner.nextInt();
		}
		
		System.out.println("tabla de multiplicar del " + numero + " :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
			
		}
		
		scanner.close();
	}

}
