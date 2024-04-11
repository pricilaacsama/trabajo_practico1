package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
private int n;
	
	public CalculadoraEspecial() {
		this.n = 0;
	}
	
	public CalculadoraEspecial(int n) {
		this.n = n;
	}


	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	//calcula sumatoria;
	public long calcularSumatoria() {
		long sumatoria = 0;
		for (int k = 1; k <= n; k++) {
			long resultado = (k * (k + 1) / 2) * (k * (k + 1) / 2);
			sumatoria = sumatoria + resultado;
		}
		return sumatoria;
	}
	
	//calcula productoria (esta mal la productoria me da el resultado pero el doble);
	public long calcularProductoria() {
		long productoria = 1;
		for (int k = 1; k <= n; k++) {
            productoria *= k * (k + 4);
        }
		return productoria;
	}
	

	
}
