package logico;

import java.util.ArrayList;

public class Medico extends Persona {

	private String codeMedico;
	private String especialidad;
	private ArrayList<Cita> citasPendientes;
	
	public Medico(String cedula, String nombre, char sexo, String telefono, String direccion, String codeMedico,
			String especialidad) {
		super(cedula, nombre, sexo, telefono, direccion);
		this.codeMedico = codeMedico;
		this.especialidad = especialidad;
		this.citasPendientes = new ArrayList<Cita>();
	}

	public String getCodeMedico() {
		return codeMedico;
	}

	public void setCodeMedico(String codeMedico) {
		this.codeMedico = codeMedico;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public ArrayList<Cita> getCitasPendientes() {
		return citasPendientes;
	}

	public void setCitasPendientes(ArrayList<Cita> citasPendientes) {
		this.citasPendientes = citasPendientes;
	}
	
}
