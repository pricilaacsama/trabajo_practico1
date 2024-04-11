package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero: ");
		int num = scanner.nextInt();
		
		while (num < 0 || num > 10) {
			System.out.println("Debe ingresar un numero entre 0 y 10:");
			num = scanner.nextInt();
		}
		//CALCULA EL FACTORIAL DE NUM;
		int fact = 1;
		int i = num;
		
		while(i > 0) {
			fact = fact * i;
			i--;
		}
		
		System.out.println("el factorial de " + num + " es " + fact);
		
		scanner.close();
	}

}
