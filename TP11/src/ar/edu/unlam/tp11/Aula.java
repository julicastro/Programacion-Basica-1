package ar.edu.unlam.tp11;
import java.util.Scanner;
public class Aula {
	private String cantidadDeEscritorios [][];
	private int numeroDelAula;
	private String alumnoIngresado;
	private int cantidadAlumnos=0;
	Scanner teclado = new Scanner(System.in);
	
	public Aula(int numeroDelAula , int filasDeEscritorios , int columnasDeEscritorios ) {
		this.numeroDelAula = numeroDelAula;
		cantidadDeEscritorios = new String[filasDeEscritorios][columnasDeEscritorios];
		limpiaMatriz();
	}
	
	
	
	public boolean ocuparEscritorio() {
		System.out.println("Ingrese nombre del alumno ");
		String nombreDelAlumno = teclado.nextLine();
		System.out.println("Ingrese fila a ocupar de bancos");
		int filaDeEscritorio = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese columna a ocupar del banco");
		int columnaDeEscritorio = teclado.nextInt();
		teclado.nextLine();
		for (int i = 0; i < cantidadDeEscritorios.length; i++) {
			for (int j = 0; j < cantidadDeEscritorios.length; j++) {
				if(cantidadDeEscritorios[filaDeEscritorio][columnaDeEscritorio] == "Libre") {
					cantidadDeEscritorios[filaDeEscritorio][columnaDeEscritorio] = nombreDelAlumno;
					cantidadAlumnos++;
					return true;
				}
			}
		}
		return false;
	}
	
	public String consultarEstadoDelEscritorio() {		
			String estadoDelEscritorio ;
			System.out.println("Ingrese fila a ocupar de bancos");
			int filaDeEscritorio = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Ingrese columna a ocupar del banco");
			int columnaDeEscritorio = teclado.nextInt();
			teclado.nextLine();
			if (cantidadDeEscritorios[filaDeEscritorio][columnaDeEscritorio] != "Libre") {
				estadoDelEscritorio = "Ocupado";
			}else {
				estadoDelEscritorio = "Libre";
			}
			return estadoDelEscritorio;
	}
	
	
	
	public int getCantidadAlumnos() {
		return cantidadAlumnos;
	}

	public int disponibilidadDeEscritorios() {
		int escritoriosLibres = 0;
		for (int i = 0; i < cantidadDeEscritorios.length; i++) {
			for (int j = 0; j < cantidadDeEscritorios[i].length; j++) {
				if(cantidadDeEscritorios[i][j]=="Libre") {
					escritoriosLibres++;
				}
			}
		}
		return escritoriosLibres;
	}
	
	public boolean buscarAlumno() {
		System.out.println("Ingresa el nombre del alumno a buscar");
		String alumnoBuscado = teclado.nextLine();
		for (int i = 0; i < cantidadDeEscritorios.length; i++) {
			for (int j = 0; j < cantidadDeEscritorios[i].length; j++) {
				if(alumnoBuscado.equals(cantidadDeEscritorios[i][j])) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public void limpiaMatriz() {
		for (int i = 0; i < cantidadDeEscritorios.length; i++) {
			for (int j = 0; j < cantidadDeEscritorios[i].length; j++) {
				cantidadDeEscritorios[i][j]="Libre";
			}
		}
	}
	
	
}
