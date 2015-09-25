package test;
import modelo.Circulo;
import modelo.Punto;

public class TestCirculo {

	public static void main(String[] args) {
		
		System.out.println("*****************Escenario 1*****************");
		Circulo circulo1=new Circulo(1);
		System.out.println(circulo1+ " de Area="+circulo1.calcularArea());
		
		System.out.println("*****************Escenario 2*****************");
		Punto punto1=new Punto(1.2, 3.4);
		Circulo circulo2=new Circulo(punto1, 4);
		System.out.println(circulo2 + " de Area="+circulo2.calcularArea());
		
		System.out.println("*****************Escenario 3*****************");
		Circulo circulo3=new Circulo(new Punto (1,1), new Punto(4,5));
		System.out.println(circulo3+ " de Area="+circulo3.calcularArea());
		
		System.out.println("*****************Escenario 4*****************");
		Circulo circulo4=new Circulo(2);
		System.out.println(circulo4.equals(circulo1.getRadio()));
		
		System.out.println("*****************Escenario 5*****************");
		Circulo circulo5=new Circulo(3);
		System.out.println(circulo5+"de perimetro=" +circulo5.calcularPerimetro());
		
		System.out.println("*****************Escenario 6*****************");
		Punto punto2=new Punto(); 
		System.out.println(punto2.calcularDistancia(new Punto(5,0)));
		
		System.out.println("*****************Escenario 7*****************");
		Circulo circulo6=new Circulo(new Punto(0,0), new Punto(10,0));
		System.out.println(circulo6+"de radio="+circulo6.getRadio());
		
		System.out.println("*****************Escenario 8*****************");
		Circulo circulo7=new Circulo(1);
		System.out.println(circulo1.equals(circulo7));
		
		System.out.println("*****************Escenario 9*****************");
		Circulo circulo8=new Circulo(new Punto(0,0),5);
		System.out.println(circulo8.calcularDistancia(new Circulo(new Punto(5,0),5)));
		
		
		
		
		
	}

}
