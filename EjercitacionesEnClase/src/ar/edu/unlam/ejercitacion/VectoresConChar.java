package ar.edu.unlam.ejercitacion;
import java.util.Scanner;
public class VectoresConChar {

	public static void main(String[] args) {
		char[] vector = new char [10];
		int cantidadA =0 ;
		int cantidadE = 0;
		int cantidadI = 0;
		int cantidadO =0;
		int cantidadU = 0;
		Scanner teclado = new Scanner (System.in);
		for (int  i = 0; i < vector.length; i++) {
            vector[i] = 0;
        }
		
		for (int  i = 0; i < vector.length; i++) {
            System.out.println("Ingrese una letra");
			vector [i] = teclado.next().charAt(0);
        }
		for (int i = 0 ; i < vector.length ; i++) {
        switch(vector[i]) {
        	case 'a':
        	case 'A':
        		cantidadA ++;
        		break;
        	case'e':
        	case 'E':
        		cantidadE ++;
        		break;
        	case 'i':
        	case 'I':
        		cantidadI ++;
        		break;
        	case 'o':
        	case 'O':
        		cantidadO ++;
        		break;
        	case 'u':
        	case 'U':
        		cantidadU ++;
        		break;
        	
        }
		}
		
		System.out.println("Cantidad de A " + cantidadA);
		System.out.println("Cantidad de E " + cantidadE);
		System.out.println("Cantidad de I " + cantidadI);
		System.out.println("Cantidad de O " +cantidadO);
		System.out.println("Cantidad de U " + cantidadU);
		System.out.println("Cantidad de vocales " + (cantidadA+cantidadE+cantidadI+cantidadO+cantidadU));
		

	}

}
