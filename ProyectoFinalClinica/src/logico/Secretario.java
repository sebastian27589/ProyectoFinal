package logico;

public class Secretario extends Persona {

	private String codeSecretario;

	public Secretario(String cedula, String nombre, char sexo, String telefono, String direccion,
			String codeSecretario) {
		super(cedula, nombre, sexo, telefono, direccion);
		this.codeSecretario = codeSecretario;
	}

	public String getCodeSecretario() {
		return codeSecretario;
	}

	public void setCodeSecretario(String codeSecretario) {
		this.codeSecretario = codeSecretario;
	}
}
