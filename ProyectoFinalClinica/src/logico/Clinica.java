package logico;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Vivienda> misViviendas;
	private ArrayList<Cita> misCitas;
	private ArrayList<Persona> misPersonas;
	private ArrayList<Vacuna> misVacunas;
	private ArrayList<Enfermedad> misEnfermedades;
	public static Clinica clinica = null; 
	
	public Clinica() {
		super();
		this.misViviendas = new ArrayList<Vivienda>();
		this.misCitas = new ArrayList<Cita>();
		this.misPersonas = new ArrayList<Persona>();
		this.misVacunas = new ArrayList<Vacuna>();
		this.misEnfermedades = new ArrayList<Enfermedad>();
	}

	public static Clinica getInstance() {
		
		if (clinica == null) {
			clinica = new Clinica();
		}
		
		return clinica;
	}
	
	public ArrayList<Vivienda> getMisViviendas() {
		return misViviendas;
	}
	
	public void setMisViviendas(ArrayList<Vivienda> misViviendas) {
		this.misViviendas = misViviendas;
	}
	
	public ArrayList<Cita> getMisCitas() {
		return misCitas;
	}

	public void setMisCitas(ArrayList<Cita> misCitas) {
		this.misCitas = misCitas;
	}

	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}

	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}

	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}
	
	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.misVacunas = misVacunas;
	}
	
	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}
	
	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.misEnfermedades = misEnfermedades;
	}
	
	//
	
	
}
