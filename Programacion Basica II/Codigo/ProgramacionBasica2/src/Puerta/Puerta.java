package Puerta;

public class Puerta {

	private Cerradura cerradura1;
	private Cerradura cerradura2;
	private Cerradura cerradura3;
	
	private Boolean cerradurasAbiertas = false;
	private Boolean puertaAbierta = false;
	
	public Puerta(Cerradura c1, Cerradura c2, Cerradura c3) {
		this.cerradura1 = c1;
		this.cerradura1 = c2;
		this.cerradura1 = c3;
	}
	
	public Boolean abrirCerraduras(Integer p1, Integer p2, Integer p3) {
		if(this.cerradurasAbiertas=false) {
			if(this.cerradura1.getPassword().equals(p1)) {
				if(this.cerradura2.getPassword().equals(p2)) {
					if(this.cerradura3.getPassword().equals(p3)) {
						abrirCerradurasUnaPorUna();
						this.cerradurasAbiertas=true;
					}
				}
			}
		}
		return this.cerradurasAbiertas;
	}
	
	private void abrirCerradurasUnaPorUna() {
		this.cerradura1.setCerraduraAbierta(true);
		this.cerradura2.setCerraduraAbierta(true);
		this.cerradura3.setCerraduraAbierta(true);
	}
	
	public Boolean abrirPuerta() {
		if(this.puertaAbierta==false && this.cerradurasAbiertas==true) {
			this.puertaAbierta=true;
		}else {
			this.puertaAbierta=false;
		}
		return this.puertaAbierta;
	}
	
	public Boolean cerrarPuerta() {
		if(this.puertaAbierta==true) {
			this.puertaAbierta=false;
			CerrarCerradurasUnaPorUna();
		}
		return this.puertaAbierta;
	}
	
	private void CerrarCerradurasUnaPorUna() {
		this.cerradura1.setCerraduraAbierta(false);
		this.cerradura2.setCerraduraAbierta(false);
		this.cerradura3.setCerraduraAbierta(false);
	}

	public Cerradura getCerradura1() {
		return cerradura1;
	}

	public void setCerradura1(Cerradura cerradura1) {
		this.cerradura1 = cerradura1;
	}

	public Cerradura getCerradura2() {
		return cerradura2;
	}

	public void setCerradura2(Cerradura cerradura2) {
		this.cerradura2 = cerradura2;
	}

	public Cerradura getCerradura3() {
		return cerradura3;
	}

	public void setCerradura3(Cerradura cerradura3) {
		this.cerradura3 = cerradura3;
	}

	public Boolean getCerradurasAbiertas() {
		return cerradurasAbiertas;
	}

	public void setCerradurasAbiertas(Boolean cerradurasAbiertas) {
		this.cerradurasAbiertas = cerradurasAbiertas;
	}

	public Boolean getPuertaAbierta() {
		return puertaAbierta;
	}

	public void setPuertaAbierta(Boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cerradura1 == null) ? 0 : cerradura1.hashCode());
		result = prime * result + ((cerradura2 == null) ? 0 : cerradura2.hashCode());
		result = prime * result + ((cerradura3 == null) ? 0 : cerradura3.hashCode());
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
		Puerta other = (Puerta) obj;
		if (cerradura1 == null) {
			if (other.cerradura1 != null)
				return false;
		} else if (!cerradura1.equals(other.cerradura1))
			return false;
		if (cerradura2 == null) {
			if (other.cerradura2 != null)
				return false;
		} else if (!cerradura2.equals(other.cerradura2))
			return false;
		if (cerradura3 == null) {
			if (other.cerradura3 != null)
				return false;
		} else if (!cerradura3.equals(other.cerradura3))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Puerta [cerradura1=" + cerradura1 + ", cerradura2=" + cerradura2 + ", cerradura3=" + cerradura3 + "]";
	}
	
	
	
	
	
	
}
