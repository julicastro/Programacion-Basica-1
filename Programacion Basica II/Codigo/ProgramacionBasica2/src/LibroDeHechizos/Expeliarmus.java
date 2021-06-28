package LibroDeHechizos;

public class Expeliarmus extends Hechizo{

	private String conjuro;
	
	public Expeliarmus(String conjuro) {
		super(conjuro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conjuro == null) ? 0 : conjuro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expeliarmus other = (Expeliarmus) obj;
		if (conjuro == null) {
			if (other.conjuro != null)
				return false;
		} else if (!conjuro.equals(other.conjuro))
			return false;
		return true;
	}

	public void aplicarHechizo(Hechizable hechizable) {
		hechizable.setDesarmado();
		
	}




	
	
	

}
