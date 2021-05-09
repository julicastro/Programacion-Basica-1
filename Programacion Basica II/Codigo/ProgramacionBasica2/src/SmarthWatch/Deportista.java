package SmarthWatch;

public class Deportista {

	private String nombre;
	private Integer edad;
	private Double peso;
	private Double altura;
	private Integer pasosDiarios;
	
	public Deportista(String nombre, Integer edad, Double peso, Double altura, Integer pasosDiarios) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pasosDiarios = pasosDiarios;
	}
	
	public Deportista() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getPasosDiarios() {
		return pasosDiarios;
	}

	public void setPasosDiarios(Integer pasosDiarios) {
		this.pasosDiarios = pasosDiarios;
	}
	
	
	
	
	
	
}
