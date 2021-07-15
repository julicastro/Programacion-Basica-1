package ar.edu.unlam.ejercitacion;
import java.util.Scanner;
public class Vectores {

	public static void main(String[] args) {
		int numero [] = new int [10];
		Scanner teclado = new Scanner (System.in);
		
		 for (int  i = 0; i < numero.length; i++) {
	            numero[i] = 0;
	        }
		 
		 for (int  i = 0; i < numero.length; i++) {
	            System.out.println("Ingrese un valor");
	            numero[i] = teclado.nextInt();
	        }
		 
		 for (int  i = 0; i < numero.length; i++) {
	            System.out.println(numero[i]);
	        }
                
        
    
	}
}

/*int numeros[] = new int[5];

 

        
        Scanner teclado = new Scanner(System.in);

 

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese numero");
            numeros[i] = teclado.nextInt();
        }
        
        for(int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/
