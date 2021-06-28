package LibroDeHechizos;

import java.util.HashMap;
import java.util.Map;

public class LibroDeHechizos {

	private Map<String, Hechizo> paginas = new HashMap <String, Hechizo>();
	
	
	public void agregarHechizo(Hechizo hechizo) {
		paginas.put(hechizo.getConjuro(), hechizo);
	}

	public Hechizo buscar(String conjuro) {
		return paginas.get(conjuro);
		
	}
	
	
	
}
