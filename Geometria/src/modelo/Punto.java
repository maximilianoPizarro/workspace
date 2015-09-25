package modelo;

public class Punto {
	//atributos
	private double x;
	private double y;

	//constructor
	public Punto(){
		this.x=0.0;
		this.y=0.0;
	}
		
	public Punto(double x, double y) { //sobrecargado
		this.x = x;
		this.y = y;
	}
	//metodos getter y setter	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	//re-definición de métodos de la clase object
	public boolean equals(Punto p){
	return((x==p.getX())&&(y==p.getY()));	
	}	
	
	@Override
	public String toString(){
		return "("+x+","+y+")";
	}
	
	public double calcularDistancia(Punto p){
	return Math.sqrt(Math.pow(x-p.getX(),2)+
            Math.pow(y-p.getY(), 2));	
	}
	

	

}
