package ar.edu.unlam;

import java.util.Scanner;

public class TablaASCII{

	public static void main(String args[]){
	Scanner entrada = new Scanner(System.in);	
	
	System.out.println("Digete un numero entre 33 a 225");
	char numero = (char)entrada.nextInt();
	System.out.println("El numero ingresado es: " + (int)numero);
		
	while(33<numero&&numero<255){
		if(numero>48&&numero<57){
			System.out.println("Se trata de un numero");
			System.out.println((char)numero);
		}else{if(numero>65&&numero<90){
				System.out.println("Es una letra MAYUSCULA");
				System.out.println((char)numero);
		}else{if(numero>97&&numero<122){
					System.out.println("Es una letra minuscula");
					System.out.println((char)numero);
				}else {
					System.out.println("Es un caracter especial");
					System.out.println((char)numero);
					}
				}
			}
	System.out.println("Digete un nuevo numero entre 33 a 225");
	numero = (char)entrada.nextInt();
	System.out.println("El numero ingresado es: " + (int)numero);

		}
	}
}