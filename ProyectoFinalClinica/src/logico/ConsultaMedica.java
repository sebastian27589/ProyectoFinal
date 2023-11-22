package logico;

import java.util.Date;

public class ConsultaMedica {

	private String codeConsMed;
	private String nombreMedico;
	private Enfermedad enfermedad;
	private String sintomas;
	private String diagnostico;
	private Date fechaConsulta;
	
	public String getCodeConsMed() {
		return codeConsMed;
	}
	
	public void setCodeConsMed(String codeConsMed) {
		this.codeConsMed = codeConsMed;
	}
	
	public String getNombreMedico() {
		return nombreMedico;
	}
	
	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}
	
	public Enfermedad getEnfermedad() {
		return enfermedad;
	}
	
	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public String getSintomas() {
		return sintomas;
	}
	
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	public Date getFechaConsulta() {
		return fechaConsulta;
	}
	
	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

}
