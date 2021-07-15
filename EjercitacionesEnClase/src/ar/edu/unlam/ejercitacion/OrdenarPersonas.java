package ar.edu.unlam.ejercitacion;

public class OrdenarPersonas {

	public static void main(String[] args) {
		Persona vector[] = new Persona[5];
		vector[0] = new Persona ("Jose", 10);
		vector[1]= new Persona ("Luis",5);
		vector[2] = new Persona("Maria",25);
		vector[3]= new Persona ("Juana" , 2 );
		vector[4] = new Persona ("Ignacio" , 15);
		Persona temporal = null ;
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i].getNombre()+" "+ vector[i].getDni());
		}
		System.out.println(" ");
		for (int i = 1; i < vector.length; i++) {
			for (int j = 0; j < vector.length-i; j++) {
				if(vector[j].getDni()>vector[j+1].getDni()) {
					temporal = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = temporal;
				}
			}
		}
		for (int i = 0; i < vector.length; i++) {
		System.out.println(vector[i].getNombre() +" "+ vector[i].getDni());	
		}
		
		
	}

}
