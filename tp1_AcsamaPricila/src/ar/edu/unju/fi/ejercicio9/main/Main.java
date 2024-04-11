package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productos = 1;

        while (productos <= 3) {
            Producto producto = new Producto();

            System.out.println("Ingrese los datos para el producto " + productos + ":");
            System.out.println("Ingrese el nombre del producto: ");
            producto.setNombre(scanner.nextLine());

            System.out.println("Ingrese el código del producto: ");
            producto.setCodigo(scanner.nextLine());

            System.out.println("Ingrese el precio del producto: ");
            producto.setPrecio(scanner.nextDouble());
            scanner.nextLine(); // Consumir el salto de línea pendiente

            System.out.println("Ingrese el descuento del producto (0-50%): ");
            producto.setDescuento(scanner.nextInt());
            scanner.nextLine(); // Consumir el salto de línea pendiente

            System.out.println("Datos del producto " + productos + " : ");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: $ " + producto.getPrecio());
            System.out.println("Descuento (%): " + producto.getDescuento());
            System.out.println("Precio con descuento: $ " + producto.calcularDescuento());

            productos++;
        }

        scanner.close();
    }
}
