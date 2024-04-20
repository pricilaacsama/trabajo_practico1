package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        paises.add(new Pais(1, "Argentina"));
        paises.add(new Pais(2, "Brasil"));
        paises.add(new Pais(3, "Chile"));
        paises.add(new Pais(4,"Estados Unidos"));
        paises.add(new Pais(5, "Colombia"));
        paises.add(new Pais(6, "Japon"));
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
        	System.out.println("------ Menú -----");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destino turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 - Salir");
            System.out.print("Seleccione una opción: ");
        	
        	
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    altaDestinoTuristico(scanner, destinos, paises);
                    break;
                case 2:
                    mostrarDestinos(destinos);
                    break;
                case 3:
                    modificarPais(scanner, destinos, paises);
                    break;
                case 4:
                    destinos.clear();
                    System.out.println("ArrayList de destinos turísticos limpiado.");
                    break;
                case 5:
                    eliminarDestino(scanner, destinos);
                    break;
                case 6:
                    ordenarPorNombre(destinos);
                    break;
                case 7:
                    mostrarPaises(paises);
                    break;
                case 8:
                    mostrarDestinosPorPais(scanner, destinos);
                    break;
                case 9:
                    System.out.println("Saliendo del menu...");
                    System.out.println("byee...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 9);
    }

	
	private static void mostrarDestinosPorPais(Scanner scanner, ArrayList<DestinoTuristico> destinos) {
		if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos registrados.");
            return;
        }

        System.out.print("Ingrese el código del país para mostrar los destinos turísticos: ");
        int codigoPais = scanner.nextInt();

        System.out.println("-----Destinos Turísticos del País -----");
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().getCodigo() == codigoPais) {
                System.out.println(destino);
            }
        }
   }
		

	private static void ordenarPorNombre(ArrayList<DestinoTuristico> destinos) {
		if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos registrados.");
            return;
        }

        Collections.sort(destinos, (d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));

        System.out.println("===== Destinos Turísticos Ordenados por Nombre =====");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
		
	}


	private static void eliminarDestino(Scanner scanner, ArrayList<DestinoTuristico> destinos) {
		if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos registrados.");
            return;
        }
		System.out.print("Ingrese el código del destino turístico a eliminar: ");
        int codigoDestino = scanner.nextInt();
        
        Iterator<DestinoTuristico> iterator = destinos.iterator();
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo() == codigoDestino) {
                iterator.remove();
                System.out.println("Destino turístico eliminado exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún destino turístico con ese código.");
		
	}


	private static void modificarPais(Scanner scanner, ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
		if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos registrados.");
            return;
        }

        System.out.print("Ingrese el código del destino turístico a modificar: ");
        int codigoDestino = scanner.nextInt();
        scanner.nextLine();

        DestinoTuristico destinoModificar = null;
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo() == codigoDestino) {
                destinoModificar = destino;
                break;
            }
        }
        if (destinoModificar == null) {
            System.out.println("No se encontró ningún destino turístico con ese código.");
            return;
        }
        System.out.println("Seleccione el nuevo país para el destino turístico:");
        mostrarPaises(paises);
        System.out.print("Código del nuevo país: ");
        int codigoPais = scanner.nextInt();
        
        Pais nuevoPais = null;
        for (Pais pais : paises) {
            if (pais.getCodigo() == codigoPais) {
                nuevoPais = pais;
                break;
            }
        }
        
        if (nuevoPais == null) {
            System.out.println("El código de país ingresado no es válido.");
            return;
        }

        destinoModificar.setPais(nuevoPais);
        System.out.println("País modificado exitosamente.");
        
	}


	private static void mostrarDestinos(ArrayList<DestinoTuristico> destinos) {
		if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos registrados.");
            return;
        }

        System.out.println("------ Destinos Turísticos -------");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
	}

	
	private static void mostrarPaises(ArrayList<Pais> paises) {
		if (paises.isEmpty()) {
            System.out.println("No hay países registrados.");
            return;
        }

        System.out.println("------Países ------");
        for (Pais pais : paises) {
            System.out.println(pais);
        }
		
		
	}

	private static void altaDestinoTuristico(Scanner scanner, ArrayList<DestinoTuristico> destinos,
			ArrayList<Pais> paises) {
		
		try {
            System.out.print("Ingrese el código del destino turístico: ");
            int codigo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Ingrese el nombre del destino turístico: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio del destino turístico: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.println("Seleccione el país del destino turístico: ");
            mostrarPaises(paises);
            System.out.print("Código del país: ");
            int codigoPais = scanner.nextInt();

            Pais pais = null;
            for (Pais p : paises) {
                if (p.getCodigo() == codigoPais) {
                    pais = p;
                    break;
                }
            }

            if (pais == null) {
                System.out.println("El código de país ingresado no es válido.");
                return;
            }

            System.out.print("Ingrese la cantidad de días: ");
            int cantidadDias = scanner.nextInt();

            DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
            destinos.add(destino);

            System.out.println("Destino turístico añadido con éxito.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un valor válido.");
            scanner.nextLine(); 
        }
		
		
	}
        
        
        
}


