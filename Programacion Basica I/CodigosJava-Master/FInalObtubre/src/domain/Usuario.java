package domain;

public class Usuario {
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int edad;
	private boolean logueado;
	private boolean bloquedado;
	private String passwordIngresados[];
	private int intentosFallidos;
	
	public Usuario(String usuario, String contrasenia, String nombre, String apellido, int edad, boolean logueado,
			boolean bloquedado) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.logueado = logueado;
		this.bloquedado = bloquedado;
		passwordIngresados= new String [5];
		intentosFallidos=0;
	}
	
	public boolean laContrasenaEsValida(String contrasenia) {
		boolean sePudo = false;
		int numero = 0 , mayuscula =0 , minuscula = 0 , caracteresEspeciales = 0;
		for(int i = 0 ; i < contrasenia.length() ; i++) {
			if (contrasenia.charAt(i) >= 48 && contrasenia.charAt(i) <= 57) {
				numero ++;
			}else if(contrasenia.charAt(i) > 64 && contrasenia.charAt(i) < 91 ){
				mayuscula ++;
			}else if(contrasenia.charAt(i) > 96 && contrasenia.charAt(i) < 123 ) {
				minuscula ++;
			}else if (contrasenia.charAt(i) > 33 && contrasenia.charAt(i) < 47) {
				caracteresEspeciales ++;
			}
			if (numero >= 1 && mayuscula >= 1 && minuscula >= 1 && caracteresEspeciales >= 1 &&contrasenia.length() >= 7) {
				for (int j = 0; j < passwordIngresados.length && sePudo != true; j++) {
					if (passwordIngresados[j] == null) {
						passwordIngresados[j] =  contrasenia;
						setContrasenia(contrasenia);
						sePudo = true;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	public boolean cambiarContrasenia(String contrasenia) {
		if (laContrasenaEsValida(contrasenia) == true) {
			for (int i = 0; i < passwordIngresados.length; i++) {
				if (passwordIngresados[i] == null ) {
						passwordIngresados[i] = contrasenia;
						for (int j = 0; j < passwordIngresados.length; j++) {
							if (passwordIngresados[j]!= null && passwordIngresados[j].equals(contrasenia)) {
								setContrasenia(contrasenia);
								return true;
							}
						}	
				}
			}
		}
		return false;
	}
	
	public boolean loguear(String contrasena) {
		if (getContrasenia().equals(contrasena) && isBloquedado() == false && intentosFallidos<= 3) {
			setLogueado(true);
			return true;
		}
		return false;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean isLogueado() {
		return logueado;
	}
	

	public int getEdad() {
		return edad;
	}

	public void setLogueado(boolean logueado) {
		this.logueado = logueado;
	}

	public boolean isBloquedado() {
		return bloquedado;
	}

	public void setBloquedado(boolean bloquedado) {
		this.bloquedado = bloquedado;
	}

	public String getUsuario() {
		return usuario;
	}
	
	
}
