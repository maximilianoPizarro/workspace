package modelo;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funciones {
	//DIA
	public static String traerDia(GregorianCalendar fecha){
		String dia= String.valueOf(traerNroDia(fecha)); 
		if(traerNroDia(fecha)<10){
			dia="0"+dia;}
		return dia; 
	}
		
	public static int traerNroDia(GregorianCalendar fecha){
		return fecha.get(Calendar.DAY_OF_MONTH);
	}
	public static int traerNroDeDia(GregorianCalendar fecha){
		return fecha.get(Calendar.DAY_OF_WEEK);
	}
	public static String traerDiaEnLetras(GregorianCalendar fecha){
		String[] diaEnLetra= {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
		return diaEnLetra[traerNroDeDia(fecha)-1];
	}
	
	//MES
	public static String traerMes(GregorianCalendar fecha){
		String mes=String.valueOf(traerNroMes(fecha));
		if(traerNroMes(fecha)<10){
			mes="0"+mes;
			}
		return mes;
	}
	
	public static int traerNroMes(GregorianCalendar fecha){
		return fecha.get(Calendar.MONTH)+1;		
	}
	
	
	public static String traerMesEnLetras(GregorianCalendar fecha){
		
		String[] mesEnLetra= {"Diciembre","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre"};
		return mesEnLetra[traerNroMes(fecha)];
	}
	
	//A�O
	public static String traerAnio(GregorianCalendar fecha){
		return String.valueOf(traerNroAnio(fecha));
	}
	public static int traerNroAnio(GregorianCalendar fecha){
		return fecha.get(Calendar.YEAR);
	}
	
	//FORMATO FECHAS
	
	public static String traerFechaCorta(GregorianCalendar fecha){
		return traerDia(fecha)+"/"+traerMes(fecha)+"/"+traerAnio(fecha);
	}
	
	public static String traerFechaLarga(GregorianCalendar fecha){
		return traerDia(fecha)+" de "+traerMesEnLetras(fecha)+" de "+traerAnio(fecha);
	}
	
	//HORA
	public static String traerHora(GregorianCalendar f)
	
	{
		String ap="am";
		String hora="";
		if(f.get(Calendar.AM_PM)==1){
			ap="pm";

		}
		hora=""+f.get(Calendar.HOUR_OF_DAY)+":"+f.get(Calendar.MINUTE)+":"+f.get(Calendar.SECOND)+" "+ap;
		
		return hora;
	}
	
	//Fecha en String de 12 (dd/mm/aaaa) separado por / y por -
	
	//Funciones de comparacion de fechas:dos fechas como parametros
	//Mayores
	public static boolean esDiaMayor(GregorianCalendar f, GregorianCalendar fecha){
		return (traerNroDia(f)>traerNroDia(fecha));
	}
	public static boolean esMesMayor(GregorianCalendar f, GregorianCalendar fecha){
		boolean respuesta=false;
		if(traerNroMes(f)>traerNroMes(fecha))respuesta=true;
		return respuesta;
	}
	public static boolean esAnioMayor(GregorianCalendar f, GregorianCalendar fecha){
		boolean respuesta=false;
		if(traerNroAnio(f)>traerNroAnio(fecha))respuesta=true;
		return respuesta;
	}
	//Iguales
	public static boolean esDiaIgual(GregorianCalendar f, GregorianCalendar fecha){
		boolean respuesta=false;
		if(traerNroDia(f)==traerNroDia(fecha))respuesta=true;
		return respuesta;
	}
	public static boolean esMesIgual(GregorianCalendar f, GregorianCalendar fecha){
		boolean respuesta=false;
		if(traerNroMes(f)==traerNroMes(fecha))respuesta=true;
		return respuesta;
	}
	public static boolean esAnioIgual(GregorianCalendar f, GregorianCalendar fecha){
		boolean respuesta=false;
		if(traerNroAnio(f)==traerNroAnio(fecha))respuesta=true;
		return respuesta;
	}
	//Menores
	/*Para a�os con diferencias menores que 1, ej:2015 y 2014, retorna true*/
	public static boolean diferenciaAnioDeUno(GregorianCalendar f, GregorianCalendar fecha){
		boolean respuesta=false;
		if(traerNroAnio(f)-traerNroAnio(fecha)==1)respuesta=true;
		return respuesta;
	}
	
	public static int cantidadDiasMes(GregorianCalendar fecha){
		Integer[] cantidad={31,28,31,30,31,30,31,31,30,31,30,31};
		return cantidad[traerNroMes(fecha)-1];	
	}
	
}
