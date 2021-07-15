package turnoNoche;

public class Alumno {
    private String Nombre;
    private double[]parciales;

    public Alumno(String nombre) {
        this.Nombre=nombre;
        parciales= new double[10];
    }

    public void rendir(int numeroDeParcial,double nota) {


        parciales[numeroDeParcial]=nota;

    }
    public double[] getParciales() {
        return parciales;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    public boolean promociono() {
        if(calcularElPromedioDelParcial()>=7.0) {
            return true;
        }else{
        	return false;
        }
    }
    public double calcularElPromedioDelParcial() {
        int contador=0;
        double nota=0.0;

        for(int i=0; i< parciales.length;i++) {
            if(parciales[i]!=0) {
                nota+=parciales[i];
                contador++;

            }
        }
        nota = nota/contador;
        return nota;

  }
}

