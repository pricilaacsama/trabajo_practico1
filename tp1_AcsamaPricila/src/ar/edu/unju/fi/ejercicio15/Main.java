package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int largo;
		
		do {
			System.out.println("ingrese un numero entre el rango[5,10]");
			largo = scanner.nextInt();
		} while (largo>=5 && largo<=10);
		

			
			String[] nombres = new String[largo];
			
			for (int i=0; i<nombres.length; i++) {
				System.out.println("ingrese un nombre: ");
				nombres[i] = scanner.next();	
			}
			System.out.println("Valores almacenados en el array (comenzando desde el primer índice):");
			
			for(int i=0; i<nombres.length; i++) {
				System.out.println("Posicion "+ i + " : " + nombres[i]);	
			}
			
			System.out.println("Valores almacenados en el array (comenzando desde la ultima índice):");
			
			for (int i=nombres.length-1; i>=0; i--) {
				System.out.println("Posicion "+ i + " : "+ nombres[i]);
			}
			
			
		 
		
		
		scanner.close();
	}

}
