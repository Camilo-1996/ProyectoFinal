package gestion;

import java.time.LocalDate;

public class Billete {


	private Persona datosPasajero;
	private static long numeroBillete;
	private long nBillete;
	private LocalDate fecha;
	
	
	
	//m�todo para consultar los datos del billete
	public void datosBillete() {
		
		System.out.println("DATOS BILLETE N� "+ nBillete);
			
		//falta poner los otros datos persona y Vuelo
	}
	
	public void setFecha(int dia, int mes, int a�o) {
		
		
	}
	//Creo Getters y Setters de apoyo
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	

	
}