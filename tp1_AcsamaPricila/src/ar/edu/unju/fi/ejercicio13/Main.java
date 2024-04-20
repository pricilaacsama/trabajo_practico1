package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[8];
		
		for(int i=0; i<8; i++) {
			System.out.println("ingrese un valor numerico: ");
			numeros[i] = scanner.nextInt();
			
		}
		
		System.out.println("valores almacenados en el array: ");
		for (int i = 0; i<8; i++) {
			System.out.println("Indice: " + i + " | Valor: "+ numeros[i]);
			
		}
		
		scanner.close();
	}

}
