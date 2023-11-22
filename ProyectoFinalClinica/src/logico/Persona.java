package logico;

public class Persona {
	protected String cedula;
	protected String nombre;
	protected char sexo;
	protected String telefono;
	protected String direccion;
	
	public Persona(String cedula, String nombre, char sexo, String telefono, String direccion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.sexo = sexo;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
