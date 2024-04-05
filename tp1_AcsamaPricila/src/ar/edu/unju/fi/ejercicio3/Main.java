package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero: ");
		
		int valor = scanner.nextInt();
		
		if (valor % 2 == 0) {
			int par = valor * 3;
			System.out.println("el numero ingresado es par");
			System.out.println("el triple del numero ingresado es: "+ par);
		} else {
			int impar = valor *2;
			System.out.println("el numero ingresado es impar.");
			System.out.println("el doble del numero ingresado es: "+ impar);
		}
			
		scanner.close();
		
	}

}
