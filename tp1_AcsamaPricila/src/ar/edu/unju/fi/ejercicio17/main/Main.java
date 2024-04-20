package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Jugador> jugadores = new ArrayList<>();
		int op;
		
		do {
			System.out.println("-------MENU DE OPCIONES-------");
			System.out.println("1) Alta de jugador");
			System.out.println("2) Mostrar los datos del jugador");
			System.out.println("3) Mostrar todos los jugadores ordenados por apellidos");
			System.out.println("4) Modificar los datos de un jugador ");
			System.out.println("5) Eliminar un jugador");
			System.out.println("6) Mostrar la cantidad total de jugadores que tiene el arraylist");
			System.out.println("7) Mostrar la cantidad de jugadores que pertenece a una nacionalidad");
			System.out.println("8) SALIR");
			
			op = scanner.nextInt();
			
			switch (op) {
			case 1:
				
				altaJugador(jugadores, scanner);
				
				break;
			case 2:
				
				mostrardatosJugador(jugadores, scanner);
				break;
			case 3:
				mostrarJugadoresOrdenados(jugadores);
			     
			    break;
			case 4:
				modificarDatosJugador(scanner, jugadores);
				
			break;
			case 5:
				eliminarJugador(scanner, jugadores);
				
				break;
			case 6:
				System.out.println("Cantidad total de jugadores: " + jugadores.size());
				
				break;
			case 7:
				mostrarCantidadNacionalidad(scanner, jugadores);
				
				break;
			case 8:
				System.out.println("Saliendo del menu...");
				System.out.println("byee");
				break;
			default:
				System.out.println("Opcion invalida. Ingrese de nuevo una opcion valida");
			
			}
			
			
		} while (op!=8);
		
		scanner.close();
 }

	private static void mostrarCantidadNacionalidad(Scanner scanner, ArrayList<Jugador> jugadores) {
			scanner.nextLine();
	        System.out.println("Mostrar la cantidad de jugadores que pertenecen a una nacionalidad:");
	        System.out.print("Ingrese la nacionalidad: ");
	        String nacionalidad = scanner.nextLine();
	        
	        int cant=0;
	        
	        for(int i=0; i<jugadores.size();i++) {
	        	Jugador jugador = jugadores.get(i);
	        	
	        	if(jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
	        		cant++;
	        	}	
	        }
	        System.out.println("La cantidad de jugadores de Nacionalidad " + nacionalidad + " es: " + cant);
	        
	}

	private static void eliminarJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
		scanner.nextLine();
		System.out.println("Eliminar un jugador:");
        System.out.print("Ingrese el nombre del jugador que desea eliminar: ");
        String nombreEliminar = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador que desea eliminar: ");
        String apellidoEliminar = scanner.nextLine();
		
        Iterator<Jugador> iterador = jugadores.iterator();
        boolean encontradoEliminar = false;
        while (iterador.hasNext()) {
            Jugador jugador = iterador.next();
            if (jugador.getNombre().equalsIgnoreCase(nombreEliminar) && jugador.getApellido().equalsIgnoreCase(apellidoEliminar)) {
                iterador.remove();
                encontradoEliminar = true;
                System.out.println("Jugador eliminado con éxito.");
                break;
            }
        }
        if (!encontradoEliminar) {
            System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
        }
        
		
	}

	private static void modificarDatosJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
		scanner.nextLine();
		System.out.println("Modificar los datos de un jugador:");
        System.out.print("Ingrese el nombre del jugador que desea modificar: ");
        String nombreModificar = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador que desea modificar: ");
        String apellidoModificar = scanner.nextLine();
		
        boolean encontradoModificar=false;
        for (int i=0; i<jugadores.size(); i++) {
        	Jugador jugador = jugadores.get(i);
        	
        	 if (jugador.getNombre().equalsIgnoreCase(nombreModificar) && jugador.getApellido().equalsIgnoreCase(apellidoModificar)) {
                 encontradoModificar = true;
                 System.out.println("Datos actuales del jugador:");
                 jugador.mostrarDatos();
                 System.out.println("Ingrese los nuevos datos del jugador:");

                 System.out.print("Nuevo nombre: ");
                 jugador.setNombre(scanner.nextLine());

                 System.out.print("Nuevo apellido: ");
                 jugador.setApellido(scanner.nextLine());

                 System.out.print("Nueva fecha de nacimiento (AAAA-MM-DD): ");
                 LocalDate nuevaFechaNacimiento = LocalDate.parse(scanner.nextLine());
                 jugador.setFechaNac(nuevaFechaNacimiento);

                 System.out.print("Nueva nacionalidad: ");
                 jugador.setNacionalidad(scanner.nextLine());

                 System.out.print("Nueva estatura: ");
                 double nuevaEstatura = scanner.nextDouble();
                 jugador.setEstatura(nuevaEstatura);

                 System.out.print("Nuevo peso: ");
                 double nuevoPeso = scanner.nextDouble();
                 jugador.setPeso(nuevoPeso);

                 scanner.nextLine(); 
                 System.out.print("Nueva posición (delantero, medio, defensa, arquero): ");
                 jugador.setPosicion(scanner.nextLine());

                 System.out.println("Datos actuales del jugador:");
                 jugador.mostrarDatos();

                 jugadores.set(i, jugador);
                 break;
             }
        }
        
        if (!encontradoModificar) {
            System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
        }
        
	}

	private static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
		if (jugadores.isEmpty()) {
			System.out.println("no hay jugadores registrados!");
			return;
		}
		
		Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));
		System.out.println("Todos los jugadores ordenados por apellido:");
	    for (int i = 0; i < jugadores.size(); i++) {
	        Jugador jugador = jugadores.get(i);
	        jugador.mostrarDatos();
	    } 
		
	}

	
	private static void mostrardatosJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		scanner.nextLine();
        System.out.println("Mostrar datos del jugador");
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.nextLine();
        boolean encontrado = false;
        
        for(int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                jugador.mostrarDatos();
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
        }
        
        
		
	}

	private static void altaJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		 scanner.nextLine();
	        try {
				
				System.out.println("Alta de jugador");
				System.out.println("ingrese el nombre: ");
				String nombre = scanner.nextLine();
				System.out.println("ingrese el apellido: ");
				String apellido = scanner.nextLine();
				System.out.println("ingrese la fecha de nacimineto (AAAA-MM-DD):");
				LocalDate fechaNac = LocalDate.parse(scanner.nextLine());
				System.out.println("ingrese la nacionalidad: ");
				String nacionalidad = scanner.nextLine();
				System.out.println("ingrese la estatura: ");
				Double estatura = scanner.nextDouble();
				System.out.println("ingrese el peso: ");
				Double peso = scanner.nextDouble();
				scanner.nextLine();
		        System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
		        
		        String posicion;
		        do {
		            System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
		            posicion = scanner.nextLine().toLowerCase();
		        } while (!posicion.equals("delantero") && !posicion.equals("medio") && !posicion.equals("defensa") && !posicion.equals("arquero"));
		        
		        
		        Jugador jugador = new Jugador(nombre, apellido, fechaNac, nacionalidad, estatura, peso, posicion);
		        jugadores.add(jugador);
		        System.out.println("Jugador añadido con éxito.");
				} catch (DateTimeParseException e) {
					System.out.println("debe ingresar correctamente la fecha de nacimiento (AAAA-MM-DD)");
				} catch (InputMismatchException e) {
				System.out.println("debe ingresar correctamente la estatura o peso.");
				}
	        
	        
	    }
			
		
		
}
		
		
