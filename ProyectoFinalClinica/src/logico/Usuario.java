package logico;

public class Usuario extends Persona {
	
	private String rolUsuario;
	private String nombreUsuario;
	private String contrasena;

	public Usuario(String cedula, String nombre, char sexo, String telefono, String direccion, String rolUsuario, String nombreUsuario, String contrasena) {
		super(cedula, nombre, sexo, telefono, direccion);
		this.nombre = nombre;
	}

	public String getRolUsuario() {
		return rolUsuario;
	}

	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
