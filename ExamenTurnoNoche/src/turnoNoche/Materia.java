package turnoNoche;

public class Materia {
    private int codigoDeMateria;
    private String nombreDeMateria;
    private Alumno[] alumnos;
    double promedio[]=new double[10];
    public Materia(String nombre) {
        this.nombreDeMateria=nombre;
        alumnos=new Alumno[30];
    }

    public boolean agregarAlumno(Alumno alumno) {
        for(int i=0;i<alumnos.length;i++) {
            if(alumnos[i]==null) {
                alumnos[i]=alumno;
                return true;
            }
        }return false;
    }
    public int getCantidadDeAlumnos() {
        int contador=0;
        for(int i=0;i<alumnos.length;i++) {
            if(alumnos[i]!=null) {
                contador=contador+1;

            }

        }return contador;
    }
    public double calcularElPromedioDelParcial(int numeroDeAlumno) {
         int contador=0;
         double nota=0.0;
         promedio= alumnos[numeroDeAlumno].getParciales();
         for(int i=0; i< promedio.length;i++) {
             if(promedio[i]!=0) {
                 nota+=promedio[i];
                 contador++;
             }
         }
         nota = (nota / contador);
         return nota;
    }
    
    public Alumno obtenerAlumno (int posicion) {
    	return alumnos[posicion];
    }
    
    public int calcularLaCantidadDeAprobados() {
        int aprobados=0;
        for(int i=0;i< alumnos.length;i++) {
            if(alumnos[i]!=null) {
            	if(calcularElPromedioDelParcial(i)>=7.0 ) {
            		aprobados++;
            	}
            }
        }return aprobados;
    }
}
