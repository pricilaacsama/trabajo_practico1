package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private Calendar fechaNac;
	
	
	public Persona(String nombre, Calendar fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public int calcularEdad() {
		Calendar hoy = Calendar.getInstance();
		int edad = hoy.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
		if (fechaNac.get(Calendar.MONTH) > hoy.get(Calendar.MONTH) || (fechaNac.get(Calendar.MONTH) == hoy.get(Calendar.MONTH) && fechaNac.get(Calendar.DAY_OF_MONTH) > hoy.get(Calendar.DAY_OF_MONTH))) {
			edad--;
		}
		return edad;
	}
		
	public String determinarZodiaco () {
		int mes = fechaNac.get(Calendar.MONTH) + 1;
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		
		if ((mes == 3 && dia >=21) || (mes == 4 && dia <=19 )) {
			return "Aries";
		} else if ((mes == 4 && dia >=20) || (mes==5 && dia <=20)) {
			return "Tauro";
		} else if ((mes==5 && dia>=21) || (mes==6 && dia<=20)) {
			return "Geminis";
		} else if ((mes==6 && dia>=21) || (mes==7 && dia<=22)) {
			return "Cancer";
		} else if ((mes==7 && dia>=23) || (mes==8 && dia<=22)) {
			return "Leo";
		} else if ((mes==8 && dia>=23) || (mes==9 && dia<=22)) {
			return "Virgo";
		} else if ((mes==9 && dia>=23) || (mes==10 && dia<=22)) {
			return "Libra";
		} else if ((mes==10 && dia>=23) || (mes==11 && dia<=21)) {
			return "Escorpio";
		} else if ((mes==11 && dia>=22) || (mes==12 && dia<=21)) {
			return "Sagitario";
		} else if ((mes==12 && dia>=22) || (mes==1 && dia<=20)) {
			return "Capricornio";
		} else if ((mes==1 && dia>=21) || (mes==2 && dia<=19)) {
			return "Acuario";
		} else {
			return "Piscis";
		}	
	}
	
	
	public String determinarEstacion() {
		int mes = fechaNac.get(Calendar.MONTH);
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		
		if ((mes==11 && dia>=21) ||(mes<2) || (mes==2 && dia<=20)) {
			return "Verano";
		} else if ((mes==2 && dia>=21) ||(mes<5)|| (mes==5 && dia<=21)) {
			return "Otonio";
		} else if ((mes==5 && dia>=22) ||(mes<8)|| (mes==8 && dia<=23)) {
			return "Invierno";
		} else {
			return "Primavera";
		}
	}
	
}
