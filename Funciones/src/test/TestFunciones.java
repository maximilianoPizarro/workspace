package test;
import modelo.Funciones;
import java.util.GregorianCalendar;

public class TestFunciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar fecha= new GregorianCalendar();
		GregorianCalendar fecha1 = new GregorianCalendar(2015,8,11);
		GregorianCalendar fechaBis1 = new GregorianCalendar(1996,5,4);
		GregorianCalendar fechaBis2 = new GregorianCalendar(2004,6,7);
		GregorianCalendar fechaBis3 = new GregorianCalendar(2000,7,6);
		GregorianCalendar fechaNoBis1 = new GregorianCalendar(1700,7,8);
		GregorianCalendar fechaNoBis2 = new GregorianCalendar(1800,6,7);
		GregorianCalendar fechaNoBis3 = new GregorianCalendar(1900,5,6);
		GregorianCalendar fechaNoBis4 = new GregorianCalendar(2100,4,5);
		
		//1) + traerAnio ( GregorianCalendar fecha) : int
		System.out.println("1) "+Funciones.traerAnio(fecha));
		
		//2) + traerMes ( GregorianCalendar fecha) : int //devuelve int entre 1 y 12
		System.out.println("2) "+Funciones.traerMes(fecha));
		
		//3) + traerDia (GregorianCalendar fecha) : int
		System.out.println("3) "+Funciones.traerDia(fecha));
		
		//4) + esBisiesto (int anio) : boolean
		//Ser�n bisiestos los a�os divisibles por 4, exceptuando los que son divisibles por 100 y no divisibles
		//por 400.
		//ejemplos: son bisiestos 1996, 2004, 2000, 1600; No son bisiestos 1700, 1800, 1900, 2100
		System.out.println("4) ************************esBisiesto***********************************");
		
		System.out.println(Funciones.esBisiesto(Funciones.traerNroAnio(fecha1)));
		System.out.println(Funciones.esBisiesto(Funciones.traerNroAnio(fechaBis1)));
		System.out.println(Funciones.esBisiesto(Funciones.traerNroAnio(fechaBis2)));
		System.out.println(Funciones.esBisiesto(Funciones.traerNroAnio(fechaBis3)));
		System.out.println(Funciones.esBisiesto(Funciones.traerNroAnio(fechaNoBis1)));
		System.out.println(Funciones.esBisiesto(Funciones.traerNroAnio(fechaNoBis2)));
		System.out.println(Funciones.esBisiesto(Funciones.traerNroAnio(fechaNoBis3)));
		System.out.println(Funciones.esBisiesto(Funciones.traerNroAnio(fechaNoBis4)));
		
		//5) + esFechaValida (par�metros int anio, int mes de 1 a 12, int dia)
		System.out.println("5) ************************esFechaValida**********************************");
		System.out.println(Funciones.esFechaValida(2015, 6, 5));
		System.out.println(Funciones.esFechaValida(2000, 2, 29));
		System.out.println(Funciones.esFechaValida(2015,2,29));
		System.out.println(Funciones.esFechaValida(-2000, 1, 29));
		System.out.println(Funciones.esFechaValida(200000,13,30));
		System.out.println(Funciones.esFechaValida(50,11,32));
		System.out.println(Funciones.esFechaValida(2015, 2, 29));
		
		
		//6) + traerFecha (int anio, int mes, int dia) : GregorianCalendar // mes de 1 a 12
		System.out.println("6) "+Funciones.traerFechaCorta(Funciones.traerFecha(2015, 05, 05)));
		
		//7) + traerFecha (String fecha) : GregorianCalendar //par�metro de la forma �dd/mm/aaaa�	
		System.out.println("7) **********************traerFecha String********************************");
		System.out.println(Funciones.traerFechaCorta(Funciones.traerFecha("11/09/2015")));
		System.out.println(Funciones.traerNroDia(Funciones.traerFecha("24/05/1991")));
		System.out.println(Funciones.traerNroMes(Funciones.traerFecha("24/05/1991")));
		System.out.println(Funciones.traerNroAnio(Funciones.traerFecha("24/05/1991")));

		//8) + traerFechaCorta (GregorianCalendar fecha) : String //retorna �dd/mm/aaaa�
		System.out.println("8) "+Funciones.traerFechaCorta(fecha));
		
		//9) + esDiaHabil (GregorianCalendar fecha) : boolean //Consideramos h�bil de lunes a viernes.
		System.out.println("9) "+Funciones.esDiaHabil(fecha)+ " ,y una fecha que no sea habil :"+Funciones.esDiaHabil(new GregorianCalendar(2015,8,12)));
		//10) + traerDiaDeLaSemana (GregorianCalendar fecha) : String
		System.out.println("10) "+Funciones.traerDiaEnLetras(fecha));
		
		//11) + traerMesEnLetras (GregorianCalendar fecha) : String
		System.out.println("11) "+Funciones.traerMesEnLetras(fecha));
		
		//12) + traerFechaLarga (GregorianCalendar fecha) : String // �Domingo 30 de Agosto del 2015�
		System.out.println("12) "+Funciones.traerFechaLarga(fecha));
		
		//13) + sonFechasIguales(GregorianCalendar fecha , GregorianCalendar fecha1) : boolean

		System.out.println("13) **********************sonFechasIguales********************************");
		System.out.println(Funciones.sonFechasIguales(fecha, fecha1));
		System.out.println(Funciones.sonFechasIguales(fecha,fechaBis1));
		
		//14) + traerCantDiasDeUnMes (int anio, int mes) : int
		
		System.out.println("14) "+Funciones.cantidadDiasMes(2015,9));
		
		//15) + aproximar2Decimal(double valor) : double //si el 3� decimal es mayor o igual 5, suma 1 al 2� decimal )
		System.out.println("15) +aproximar2decimales");
		
		System.out.println(Funciones.aproximar2Decimal(1.115));
		System.out.println(Funciones.aproximar2Decimal(0.115));
		System.out.println(Funciones.aproximar2Decimal(100.115));
		System.out.println(Funciones.aproximar2Decimal(10.555));
		System.out.println(Funciones.aproximar2Decimal(1.114));
		

	}

}
