package logico;

import java.util.Date;

public class Cita {
	private String numCita;
	private String nombreCliente;
	private String nombreMedico;
	private boolean pendiente;
	private Date fechaDeCita;
	
	public Cita(String numCita, String nombreCliente, String nombreMedico, boolean pendiente, Date fechaDeCita) {
		super();
		this.numCita = numCita;
		this.nombreCliente = nombreCliente;
		this.nombreMedico = nombreMedico;
		this.pendiente = pendiente;
		this.fechaDeCita = fechaDeCita;
	}

	public String getNumCita() {
		return numCita;
	}

	public void setNumCita(String numCita) {
		this.numCita = numCita;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public boolean isPendiente() {
		return pendiente;
	}

	public void setPendiente(boolean pendiente) {
		this.pendiente = pendiente;
	}

	public Date getFechaDeCita() {
		return fechaDeCita;
	}

	public void setFechaDeCita(Date fechaDeCita) {
		this.fechaDeCita = fechaDeCita;
	}
	
	
}
