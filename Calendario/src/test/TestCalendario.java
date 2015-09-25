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
	�C�mo crear un objeto del d�a de hoy?*/
	GregorianCalendar calendario = new GregorianCalendar();
	System.out.println(calendario.getTime());
	System.out.println("Hoy es... "+calendario.getTime().toLocaleString());
	
	/*
	�C�mo crear un objeto de d�a determinado?*/
	GregorianCalendar calendario1 = new GregorianCalendar(2015,11,25);
	System.out.println(calendario1.getTime());
	/*
	�C�mo saber si un d�a est� antes que otro?*/
	System.out.println(calendario.before(calendario1));
	/*
	�C�mo saber si un d�a est� despu�s que otro?*/
	System.out.println(calendario.after(calendario1));
	/*
	�C�mo capturar el d�a de un objeto GregorianCalendar?*/
	System.out.println("Dia de hoy..."+calendario.get(calendario.DAY_OF_MONTH));
	System.out.println("D�a de hoy "+Funciones.traerDia(calendario));
	System.out.println("D�a de hoy "+Funciones.traerDiaEnLetras(calendario));
	/*Hay que settear las fechas de los siguientes escenarios*/
	System.out.println("Este viernes es "+Funciones.traerDiaEnLetras(new GregorianCalendar(2015,8,04)));
	System.out.println("El 7 de septiembre cae "+Funciones.traerDiaEnLetras(new GregorianCalendar(2015,8,07)));
	System.out.println("Ayer fue "+Funciones.traerDiaEnLetras(new GregorianCalendar(2015,8,1)));
	System.out.println("Antes de Ayer fue "+Funciones.traerDiaEnLetras(new GregorianCalendar(2015,7,29)));
	/*
	�C�mo capturar el n�mero mes de un objeto GregorianCalendar?*/
	System.out.println("Mes de hoy..."+(calendario.get(calendario.MONTH)+1));
	System.out.println("Mes de hoy "+Funciones.traerMes(calendario));
	System.out.println("Mes de hoy "+Funciones.traerMesEnLetras(calendario));
	/*
 	�C�mo capturar el a�o de un objeto GregorianCalendar?	
	 */
    System.out.println("A�o de hoy..."+calendario.get(calendario.YEAR));
    System.out.println("A�o de hoy "+Funciones.traerAnio(calendario));
	

	/*Fecha de hoy con formato
	 */
	System.out.println(Funciones.traerFechaCorta(calendario));
	System.out.println(Funciones.traerFechaCorta(calendario1));
	
	GregorianCalendar prueba= new GregorianCalendar();
	System.out.println(Funciones.traerFechaCorta(prueba));
	
	System.out.println(Funciones.esDiaMayor(new GregorianCalendar(2015,07,03), new GregorianCalendar(2015,07,04)));
    
	}
	
}
