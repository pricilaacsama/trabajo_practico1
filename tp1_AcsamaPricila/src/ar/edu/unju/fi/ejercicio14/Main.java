package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int tamanio;
		
		do {
			System.out.println("ingrese un numero entre el rango[3,10]");
			tamanio = scanner.nextInt();
		} while (tamanio>=3 && tamanio<=10);
			
			int[] numeros = new int[tamanio];
			
			int suma=0;
			for (int i=0; i<tamanio; i++) {
				System.out.println("ingrese un valor numerico: ");
				numeros[i] = scanner.nextInt();
				suma = suma + numeros[i];
				
			}
			
			System.out.println("Valores alcamenados en el array: ");
			for (int i=0; i<tamanio; i++) {
				System.out.println("Posicion " + i + " | Valor:  " + numeros[i]);
				
			}
			System.out.println("La suma de todos los valores es: " + suma);
			
			
		 
		
		scanner.close();

	}

}
