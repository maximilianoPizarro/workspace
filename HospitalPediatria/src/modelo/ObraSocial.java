package modelo;

public class ObraSocial {

	private String obraSocial;
	private String email;
	private String telefono;
	
	
	public ObraSocial(String obraSocial, String email, String telefono) {
		super();
		this.obraSocial = obraSocial;
		this.email = email;
		this.telefono = telefono;
	}
	public String getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public String toString(){
	return(" Obra Social: "+obraSocial+" Email: "+email+" Telefono: "+telefono);
	}
	
	
	
}
