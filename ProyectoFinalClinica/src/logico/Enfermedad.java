package logico;

public class Enfermedad {

	private String nombre;
	private String tipo;
	private String sintomas;
	private boolean vigilada;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getSintomas() {
		return sintomas;
	}
	
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
	public boolean isVigilada() {
		return vigilada;
	}
	
	public void setVigilada(boolean vigilada) {
		this.vigilada = vigilada;
	}
	
}
