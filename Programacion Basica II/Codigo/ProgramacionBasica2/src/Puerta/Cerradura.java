package Puerta;

public class Cerradura {

	private Integer password;
	private Boolean cerraduraAbierta = false;
	
	public Cerradura(Integer password) {
		this.password = password;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public Boolean getCerraduraAbierta() {
		return cerraduraAbierta;
	}

	public void setCerraduraAbierta(Boolean cerraduraAbierta) {
		this.cerraduraAbierta = cerraduraAbierta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Cerradura other = (Cerradura) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
	
	
	
}
