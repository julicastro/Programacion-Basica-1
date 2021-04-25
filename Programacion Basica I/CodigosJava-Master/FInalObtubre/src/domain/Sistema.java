package domain;

public class Sistema {
	private String nombreDelSistema;
	private Usuario usuarios[];
	private int cantidadDeUsuarios;
	public Sistema(String nombreDelSistema , int cantidadMaximaDeUsuarios) {
		super();
		this.nombreDelSistema = nombreDelSistema;
		usuarios = new Usuario[cantidadMaximaDeUsuarios];
		cantidadMaximaDeUsuarios=0;
	}
	
	public boolean agregarUsuario(Usuario nuevo) {
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i]==null) {
				usuarios[i] = nuevo;
				cantidadDeUsuarios++;
				return true;
			}
		}
		return false;
	}
	
	public int calcularLaCantidadDeUsuariosLogueados() {
		return cantidadDeUsuarios;
	}

	public int calcularLaCantidadDeUsuariosBloqueados() {
		int usuarioBloqueados = 0;
		for (int i = 0; i < cantidadDeUsuarios; i++) {
			if (usuarios[i].isBloquedado()== true) {
				usuarioBloqueados++;
			}
		}
		return usuarioBloqueados;
	}
	
	public int calcularElPorcentajeDeUsuariosLogueados() {
		int usuarioLogeados = 0;
		for (int i = 0; i < cantidadDeUsuarios; i++) {
			if (usuarios[i].isLogueado() == true) {
				usuarioLogeados++;
			}
		}
		return usuarioLogeados / cantidadDeUsuarios;
	}
	
	public double calcularEdadPromedio() {
        double edadPromedio=0.0;
        for (int i = 0; i < cantidadDeUsuarios; i++) {
			edadPromedio += usuarios[i].getEdad();
		}
        return edadPromedio/cantidadDeUsuarios;
    }
	
	public boolean loguearUsuario (String usuario, String contraseña) {
		for (int i = 0; i < cantidadDeUsuarios; i++) {
			if (usuarios[i].getUsuario().equals(usuario) && usuarios[i].getContrasenia().equals(contraseña) && usuarios[i].isBloquedado()==false) {
				usuarios[i].setLogueado(true);
				return true;
			}
		}
		return false;
	}
}
