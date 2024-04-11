package ar.edu.unju.fi.ejercicio10.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			for (int i=1; i <= 3; i++) {
				Pizza pizza = new Pizza();
				
				System.out.println("** PIZZA " + i + " ** ");
				System.out.println("ingrese el diametro de la pizza (20, 30, 40): ");
				int diametro = scanner.nextInt();
				if (diametro == 20 || diametro == 30 || diametro == 40) {
				
				pizza.setDiametro(diametro);
				
				System.out.println("¿Lleva ingredientes especiales? (true o false): ");
	            boolean ingredientesEspeciales = scanner.nextBoolean();
	            pizza.setIngredientesEspeciales(ingredientesEspeciales);
				
				pizza.calcularPrecio();
				pizza.calcularArea();
				
				
				System.out.println("Diametro = " + pizza.getDiametro());
				System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
				System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
				System.out.println("Area de la Pizza = " + pizza.getArea());
				System.out.println();
				} else {
					System.out.println("EL DIAMETRO NO ES VALIDO: ");
				}
	            
			}
			
			scanner.close();
			
		}

}