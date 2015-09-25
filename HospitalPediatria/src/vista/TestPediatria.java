package vista;
import java.util.GregorianCalendar;
import modelo.ObraSocial;
import modelo.Paciente;
public class TestPediatria {
	public static void main(String[] args) {

		ObraSocial obra1 = new ObraSocial("Sociedad","asd@asd.com","42220122");
		Paciente pac1 = new Paciente("Lopez","Juan",9999999,new GregorianCalendar(2015,7,2,18,32,20),obra1);

		System.out.println("Traer fecha de nacimiento "+pac1.traerFechaDeNacimiento());
		
		//ESCENARIOS Metodo EDAD
		//Dias
		/*1*/Paciente pac4=new Paciente("AAA","BBB",9999999,new GregorianCalendar(2015,8,4),obra1);
		System.out.println(pac4.traerEdad());
		/*2*/Paciente pac5=new Paciente("BBB","CCC",9999999,new GregorianCalendar(2015,8,3),obra1);
		System.out.println(pac5.traerEdad());
		
		//Meses
		/*3*/Paciente pac6=new Paciente("BBB","CCC",9999999,new GregorianCalendar(2015,7,4),obra1);
		System.out.println(pac6.traerEdad());
		/*4*/Paciente pac7=new Paciente("BBB","CCC",9999999,new GregorianCalendar(2014,7,4),obra1);
		System.out.println(pac7.traerEdad());	
		/*5*/Paciente pac2 = new Paciente("Acosta","Joaquin",1111111,new GregorianCalendar(2014,9,2),obra1);
		System.out.println(pac2.traerEdad());
		
		//Años
		/*6*/Paciente pac3 = new Paciente("Espinosa","Nicolas",36084320,new GregorianCalendar(1991,4,24),obra1);
		System.out.println(pac3.traerEdad()); 
		
		/*6*/Paciente pac8 = new Paciente("Maximiliano","Pizarro",36771843,new GregorianCalendar(1992,4,5),obra1);
		System.out.println(pac8.traerEdad()); 

		
	}
}
