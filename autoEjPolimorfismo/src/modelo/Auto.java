package modelo;

public class Auto {
	//atributos
	public String patente;
	public String chasis;
	public int modelo;
	public String marca;
	//contructor
	public Auto(String patente, String chasis, int modelo, String marca){
		this.patente=patente;
		this.chasis=chasis;
		this.modelo=modelo;
		this.marca=marca;
	}
	//getters y setters
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	//redefinicion de la clase Object
	public boolean equals(Auto a){
		return ((patente.compareTo(a.getPatente())==0)&&(chasis.compareTo(a.getChasis())==0)&&(modelo==a.getModelo())&&(marca.compareTo(a.getMarca())==0));
	}
	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", chasis=" + chasis + ", modelo="
				+ modelo + ", marca=" + marca + "]";
	}
	
	
	

}
