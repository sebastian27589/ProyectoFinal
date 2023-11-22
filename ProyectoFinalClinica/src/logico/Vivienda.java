package logico;

public class Vivienda {

	private String calle;
	private String numero;
	private String sector;
	private String ciudad;
	private String telefonoResi;
	
	public Vivienda(String calle, String numero, String sector, String ciudad, String telefonoResi) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.sector = sector;
		this.ciudad = ciudad;
		this.telefonoResi = telefonoResi;
	}

	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getSector() {
		return sector;
	}
	
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getTelefonoResi() {
		return telefonoResi;
	}
	
	public void setTelefonoResi(String telefonoResi) {
		this.telefonoResi = telefonoResi;
	}
	
}
