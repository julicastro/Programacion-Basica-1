package ar.edu.unlam.tp8;

import java.util.Date;

public class Empleado {
	private int fechaDeIngreso;
	private String antiguedad;
	
	public Empleado (int ano , int mes , int dia) {
		fechaDeIngreso =  ano * 1000 + mes * 100 + dia;
	}
	
	public String calcularDiasDeVacaciones(int anoActual , int mesActual , int diaActual) {
		int fechaHoy = anoActual * 1000 + mesActual * 100 + diaActual;
		int operacion = fechaHoy - fechaDeIngreso;
		if(operacion >= 10000) {
			return "Le corresponde 28 dias";
		}else if(operacion <= 10000 && operacion >=5000){
			return "Le corresponde 21 dias";
		}else if(operacion <= 5000 && operacion >= 600) {
			return "le corresponde 15 dias";
		}else {
			return "No tiene vacaciones";
		}
	}
	
}
