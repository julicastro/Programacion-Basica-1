package SmarthWatch;

import java.util.ArrayList;
import java.util.List;

public class Competencia {

	protected String competencia;
	protected List <Deportista> competidores = new ArrayList<Deportista>();
	
	protected List agregarDeportista(Deportista deportista) {
		deportista = new Deportista();
		this.competidores.add(deportista);
		return this.competidores;
	}
	
	
	
}
