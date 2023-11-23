package logico;

import java.util.ArrayList;

public class Vacuna {

	private String codeVacuna;
	private String nombre;
	private ArrayList<Enfermedad> enfermedadesQueTrata;
	
	public Vacuna(String codeVacuna, String nombre) {
		super();
		this.codeVacuna = codeVacuna;
		this.nombre = nombre;
		this.enfermedadesQueTrata = new ArrayList<Enfermedad>();
	}

	public String getCodeVacuna() {
		return codeVacuna;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Enfermedad> getEnfermedadesQueTrata() {
		return enfermedadesQueTrata;
	}
	
	public void setEnfermedadesQueTrata(ArrayList<Enfermedad> enfermedadesQueTrata) {
		this.enfermedadesQueTrata = enfermedadesQueTrata;
	}
	
}
