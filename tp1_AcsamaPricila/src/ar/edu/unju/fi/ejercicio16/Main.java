package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] personas = new String[5];
		
		for (int i=0; i<personas.length; i++) {
			System.out.println("ingrese un nombre: ");
			personas[i] = scanner.next();
		}
		
		System.out.println("Valores guardados en el array: ");
		int i=0;
		while (i<personas.length) {
			System.out.println("posicion " + i + " : "+ personas[i]);
			i++;
		}
		
		System.out.println("Tamano del array: " + personas.length);
		
		Byte indiceEliminar;
		
		do {
			System.out.println("ingrese el indice del elemento a eliminar [0-"+(personas.length-1)+"]: ");
			indiceEliminar = scanner.nextByte();
		} while (indiceEliminar<0 || indiceEliminar >= personas.length);
		
		
		for (int x=indiceEliminar; x <personas.length-1; x++) {
			personas[x]=personas[x+1];
		}
		personas[personas.length-1] = null;
		
		System.out.println("Valores actualizados del array: ");
		
		
		for (int j=0; j <=personas.length-1; j++) {
		if (personas[j] != null) {
			System.out.println("posicion " + j + " valor: "+ personas[j]);
		}
	}
		scanner.close();
	}

}
