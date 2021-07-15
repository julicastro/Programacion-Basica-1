package ar.edu.unlam.tp8;

import java.util.Scanner;

public class PruebaEstadisticaPersona {

	public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);	
			double edadBajoPeso = 0;
			double edadSobrePeso = 0;
			double ingresoPeso = 0;
			double ingresoEdad = 0;
			double peso = 0;
			double altura = 0;
			double imc =0.0;
			double promedioEdadBajoPeso=0.0;
			double promedioEdadSobrePeso = 0.0;
			int personasBajoPeso =0;
			int personasPesoNormal =0;
			int personasSobrePeso =0;
			int i = 1;
			System.out.println("Ingrese cantidad de personas : ");
			int cantidadDePersonas = teclado.nextInt();

			while(i<=cantidadDePersonas){
		            System.out.print("Ingrese peso:");
		            ingresoPeso=teclado.nextDouble();
		            peso=peso + ingresoPeso;
		            System.out.print("Ingrese altura:");
		            altura=teclado.nextDouble();
		            System.out.print("Ingrese edad:");
		            ingresoEdad=teclado.nextDouble();
		            imc = (ingresoPeso / Math.pow(altura,2));
		            if(imc<20){
						personasBajoPeso = ++personasBajoPeso;
						edadBajoPeso = edadBajoPeso + ingresoEdad;
						promedioEdadBajoPeso = (edadBajoPeso / personasBajoPeso);
					}else if(imc>=20 && imc<=25){
						personasPesoNormal = ++personasPesoNormal;
					}else {
						personasSobrePeso = ++personasSobrePeso;
						edadSobrePeso = edadSobrePeso + ingresoEdad;
						promedioEdadSobrePeso = (edadSobrePeso / personasSobrePeso);
					}
					i++;
				}

		        System.out.println("El peso promedio es : " + (peso/cantidadDePersonas));
			
		        System.out.println("cantidad de personas con bajo peso : " + personasBajoPeso);
		        System.out.println("cantidad de personas con peso normal : " + personasPesoNormal);
		        System.out.println("cantidad de personas con sobre peso : " + personasSobrePeso);
		        System.out.println("Edad promedio de personas con bajo peso : " + promedioEdadBajoPeso);
		        System.out.println("Edad promedio de personas con sobre peso : " + promedioEdadSobrePeso);
	}	

}
