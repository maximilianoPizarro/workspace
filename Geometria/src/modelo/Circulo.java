package modelo;

public class Circulo {
//atributos	
	private Punto origen;
	private double radio;
	//constructor	
		public Circulo(double radio){
			this.origen=new Punto(0,0);
			this.radio=radio;
		}
	//sobrecargo
		public Circulo(Punto origen, double radio) {
			this.origen = origen;
			this.radio = radio;
		}
		public Circulo(Punto origen, Punto radio){
			this.origen=origen;
			this.setRadio(radio);
		}
	//getters&setters
		public Punto getOrigen() {
			return origen;
		}
		public void setOrigen(Punto origen) {
			this.origen = origen;
		}
		public double getRadio() {
			return radio;
		}
		public void setRadio(double radio) {
			this.radio = radio;
		}
	
		public void setRadio(Punto radio){//sobrecargo
			this.radio=origen.calcularDistancia(radio);
		}
		
		public boolean equals(Circulo c){
		return((radio==c.getRadio())&&(origen.equals(c.getOrigen())));			
		}

		@Override
		public String toString(){
		return "Circulo centro en: "+origen+" radio="+radio;		
		}
	
		public double calcularArea(){
		return Math.PI*Math.pow(radio,2);
		}
			
		public double calcularPerimetro(){
		return Math.PI*2*radio;	
		}
		
		public double calcularDistancia(Circulo c){
		return origen.calcularDistancia(c.getOrigen());	
		}

}
