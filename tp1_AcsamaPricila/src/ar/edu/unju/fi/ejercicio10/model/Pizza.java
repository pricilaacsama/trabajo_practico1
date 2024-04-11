package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	private static final int ADICIONAL_20 = 500;
	private static final int ADICIONAL_30 = 750;
	private static final int ADICIONAL_40 = 1000;
	
	public Pizza() {
	}
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	public static int getAdicional20() {
		return ADICIONAL_20;
	}
	public static int getAdicional30() {
		return ADICIONAL_30;
	}
	public static int getAdicional40() {
		return ADICIONAL_40;
	}
	
	public void calcularPrecio() {
		double precioBase = 0;
	//	double precioAdicional = 0;
		
		switch (diametro) {
			case 20:
				if (ingredientesEspeciales == false) {
					precioBase = 4500;
				} else {
					precioBase = ADICIONAL_20 + 4500;
				}
				break;
			case 30:
				if (ingredientesEspeciales == false) {
					precioBase = 4800;
				} else {
					precioBase = ADICIONAL_30 + 4800;
				}
				break;
			case 40:
				if (ingredientesEspeciales == false) {
					precioBase = 5500;
				} else {
					precioBase = ADICIONAL_40 + 5500;
				}
				break;
			default:
				return;
		}
		
		precio = precioBase;
	}
	
	public void calcularArea() {
		area = Math.PI * Math.pow((diametro / 2.0), 2);
	}
	

	
}
