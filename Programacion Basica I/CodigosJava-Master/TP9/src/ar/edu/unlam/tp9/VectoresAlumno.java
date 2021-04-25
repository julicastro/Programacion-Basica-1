package ar.edu.unlam.tp9;
import java.util.Scanner;
public class VectoresAlumno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cuanto alumnos fueron evaluados : ");
		int alumnos = teclado.nextInt();
		String vectorNombre[] = new String[alumnos];
		float vectorNota[] = new float[alumnos];
		
		for (int i = 0; i < vectorNota.length; i++) {
			vectorNota[i] = 0;
		}
		

	    for ( int i = 0; i < alumnos; i++) {

	        System.out.println((i+1)+".Ingrese nombre : ");
	        vectorNombre[i] = teclado.next();
	        System.out.println((i+1)+".Ingrese nota : ");
	        vectorNota [i]= teclado.nextFloat();
	    }
	    
	    for (int i = 0; i < alumnos; i++) {
	    	String calificacion;
	    	if(vectorNota[i]<11 && vectorNota[i]>6) {
	    		calificacion = "Promocionado";
	    	}else if(vectorNota[i]<7 && vectorNota[i]>3) {
	    		calificacion = "Aprobo";
	    	}else if(vectorNota[i]<4 && vectorNota[i]>0) {
	    		calificacion = "Desaprobo";
	    	}else {
	    		calificacion = "Error al ingresar";
	    	}
			System.out.println(vectorNombre[i]+" " + vectorNota[i] + " " + calificacion);
		}
	
	}

}
