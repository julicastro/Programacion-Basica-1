package ar.edu.unlam.ejercitacion;
import java.util.Scanner;


public class Sudoku {
    
	 private  final int COLUMNAS = 9;
	private  final int FILAS = 9;
	private final int FILAS_DE_CUADRANTE_ = 3;
	private final int COLUMNA_DE_CUADRANTE = 3;
	private int tablero[][];
	
	public Sudoku(int tablero[][]) {
		this.tablero = tablero;
	}
	
	public Sudoku() {
		tablero = new int [FILAS][COLUMNAS];
	}
	        
	 
	public boolean validarFila(int fila, int valor) {
	    boolean correcto=false;
	    
	    for(int i=0;i<FILAS;i++) {
	        if(tablero[fila][i]==valor) {
	            correcto =false;
	            break;
	        }
	        else {
	            correcto=true;
	        }
	        return correcto;
	    }
	    return correcto;
	}
	    //validarColumna(int columna, int valor)
	    public boolean validarColumna(int columna, int valor) {
	        boolean correcto=false;
	    
	        for(int i=0;i<COLUMNAS;i++) {
	            if(tablero[i][columna]==valor) {
	                correcto =false;
	                break;
	            }
	            else {
	                correcto=true;
	            }
	        }
	        return correcto;
	    }
	    
	    public boolean validarCuadrante(int fila, int columna, int valor) {
	        boolean correcto=false;
	        int filaDeCuadrante=0;
	        int columnaDeCuadrante=0;
	        
	        filaDeCuadrante=fila/FILAS_DE_CUADRANTE_;
	        columnaDeCuadrante=columna/COLUMNA_DE_CUADRANTE;
	        
	        int comienzoDeFilaAnalizar=0;
	        int comienzoDeColumnaAnalizar=0;
	        
	        switch(filaDeCuadrante) {
	        case 0:
	            comienzoDeFilaAnalizar=0;
	            break;
	        case 1:
	            comienzoDeFilaAnalizar=3;
	            break;
	        case 2:
	            comienzoDeFilaAnalizar=6;
	            break;
	        }
	        switch(columnaDeCuadrante) {
	        case 0:
	            comienzoDeColumnaAnalizar=0;
	            break;
	        case 1:
	            comienzoDeColumnaAnalizar=3;
	            break;
	        case 2:
	            comienzoDeColumnaAnalizar=6;
	            break;
	        }        
	        
	        
	        for(int i=0;i<FILAS_DE_CUADRANTE_;i++) {
	            for(int j=0;j<COLUMNA_DE_CUADRANTE;j++) {
	            
	                if(tablero[comienzoDeFilaAnalizar+i][comienzoDeColumnaAnalizar+j]==valor) {
	                    correcto =false;
	                    break;
	                }
	                else {
	                    correcto=true;
	                }
	            }
	        }    
	    
	        return correcto;
	    }    
	}