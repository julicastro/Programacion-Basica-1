package LibroDeHechizos;

public abstract class Hechizo {

	private String conjuro;
	private Integer dificultad; 
	
	public Hechizo(String conjuro) {
		this.conjuro = conjuro;
	}

	public abstract void aplicarHechizo(Hechizable hechizable);
	

	public String getConjuro() {
		return this.conjuro;
	}
	
}
