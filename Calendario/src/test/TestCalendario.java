package test;
import java.util.GregorianCalendar;
import modelo.Funciones;

public class TestCalendario {

	/**
	 * @param args
	 */
	
	@SuppressWarnings({ "static-access", "deprecation" })
	public static void main(String[] args) {

	/*
	¿Cómo crear un objeto del día de hoy?*/
	GregorianCalendar calendario = new GregorianCalendar();
	System.out.println(calendario.getTime());
	System.out.println("Hoy es... "+calendario.getTime().toLocaleString());
	
	/*
	¿Cómo crear un objeto de día determinado?*/
	GregorianCalendar calendario1 = new GregorianCalendar(2015,11,25);
	System.out.println(calendario1.getTime());
	/*
	¿Cómo saber si un día está antes que otro?*/
	System.out.println(calendario.before(calendario1));
	/*
	¿Cómo saber si un día está después que otro?*/
	System.out.println(calendario.after(calendario1));
	/*
	¿Cómo capturar el día de un objeto GregorianCalendar?*/
	System.out.println("Dia de hoy..."+calendario.get(calendario.DAY_OF_MONTH));
	System.out.println("Día de hoy "+Funciones.traerDia(calendario));
	System.out.println("Dìa de hoy "+Funciones.traerDiaEnLetras(calendario));
	/*Hay que settear las fechas de los siguientes escenarios*/
	System.out.println("Este viernes es "+Funciones.traerDiaEnLetras(new GregorianCalendar(2015,8,04)));
	System.out.println("El 7 de septiembre cae "+Funciones.traerDiaEnLetras(new GregorianCalendar(2015,8,07)));
	System.out.println("Ayer fue "+Funciones.traerDiaEnLetras(new GregorianCalendar(2015,8,1)));
	System.out.println("Antes de Ayer fue "+Funciones.traerDiaEnLetras(new GregorianCalendar(2015,7,29)));
	/*
	¿Cómo capturar el número mes de un objeto GregorianCalendar?*/
	System.out.println("Mes de hoy..."+(calendario.get(calendario.MONTH)+1));
	System.out.println("Mes de hoy "+Funciones.traerMes(calendario));
	System.out.println("Mes de hoy "+Funciones.traerMesEnLetras(calendario));
	/*
 	¿Cómo capturar el año de un objeto GregorianCalendar?	
	 */
    System.out.println("Año de hoy..."+calendario.get(calendario.YEAR));
    System.out.println("Año de hoy "+Funciones.traerAnio(calendario));
	

	/*Fecha de hoy con formato
	 */
	System.out.println(Funciones.traerFechaCorta(calendario));
	System.out.println(Funciones.traerFechaCorta(calendario1));
	
	GregorianCalendar prueba= new GregorianCalendar();
	System.out.println(Funciones.traerFechaCorta(prueba));
	
	System.out.println(Funciones.esDiaMayor(new GregorianCalendar(2015,07,03), new GregorianCalendar(2015,07,04)));
    
	}
	
}
