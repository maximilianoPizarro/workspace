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
	
	
	public static boolean esDiaHabil(GregorianCalendar fecha){
		return !(traerDiaEnLetras(fecha).compareTo("Sabado")==0)||(traerDiaEnLetras(fecha).compareTo("Domingo")==0);
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
	public static GregorianCalendar traerFecha(int anio, int mes, int dia){
		return new GregorianCalendar (anio,mes-1,dia);
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
		return (traerNroMes(f)>traerNroMes(fecha));
	}
	public static boolean esAnioMayor(GregorianCalendar f, GregorianCalendar fecha){
		return (traerNroAnio(f)>traerNroAnio(fecha));
	}
	//Iguales
	public static boolean esDiaIgual(GregorianCalendar f, GregorianCalendar fecha){
		return(traerNroDia(f)==traerNroDia(fecha));
	}
	public static boolean esMesIgual(GregorianCalendar f, GregorianCalendar fecha){
		return (traerNroMes(f)==traerNroMes(fecha));
	}
	public static boolean esAnioIgual(GregorianCalendar f, GregorianCalendar fecha){
		return (traerNroAnio(f)==traerNroAnio(fecha));
	}
	//Menores
	/*Para a�os con diferencias menores que 1, ej:2015 y 2014, retorna true*/
	public static boolean diferenciaAnioDeUno(GregorianCalendar f, GregorianCalendar fecha){
		return (traerNroAnio(f)-traerNroAnio(fecha)==1);
	}
	
	
	public static int cantidadDiasMes(GregorianCalendar fecha){
		Integer[] cantidad={31,28,31,30,31,30,31,31,30,31,30,31};
		return cantidad[traerNroMes(fecha)-1];	
	}
	
	public static int cantidadDiasMes(int anio, int mes){
		Integer[] cantidad={31,28,31,30,31,30,31,31,30,31,30,31};
		if(esBisiesto(anio))
		{
			cantidad[1]=29;
		}

		return cantidad[mes-1];	
	}
	
	public static int cantidadDiasMesAnterior(GregorianCalendar fecha){
		Integer[] cantidad={31,31,28,31,30,31,30,31,31,30,31,30};
		return cantidad[traerNroMes(fecha)-1];
	}
	
	 public static boolean esBisiesto(int anio)
	 
	 {
		 boolean respuesta=false;
		 if(anio%4==0&&anio%100!=0||anio%400==0)
		 {
			 respuesta=true;
		 }
		 return respuesta;
		 
	 }
	

	 public static boolean esFechaValida(int anio, int mes, int dia)
	 {
		 boolean respuesta=false;
		 if (anio>0)
		 {
		 if(mes>0 && mes<13)
		 	{
			 	mes=cantidadDiasMes(anio,mes);
			 	if(dia>0 && dia<=mes)
			 	{
			 		respuesta=true;
			 	} 
		 	}
	     }
		 return respuesta;
	 }
	 

	 public static GregorianCalendar traerFecha(String fecha)
	 {
		 // 0 1 2 3 4 5 6 7 8 9
		 //	2 4 / 0 5 / 1 9 9 1
		 int dia=Integer.parseInt(fecha.substring(0,2));
		 int mes=Integer.parseInt(fecha.substring(3,5));
		 int anio=Integer.parseInt(fecha.substring(6,10));

		 return traerFecha(anio,mes,dia);
		 
	 }
	 
	 public static boolean sonFechasIguales(GregorianCalendar fecha, GregorianCalendar fecha1)
	 {
		 return (traerNroAnio(fecha)==traerNroAnio(fecha1)&&traerNroMes(fecha)==traerNroMes(fecha1)&&traerNroDeDia(fecha)==traerNroDeDia(fecha1));
	 }
	
	 public static double aproximar2Decimal(double valor)
	 {
		 String valorStr = String.valueOf(0.0055+valor);
		 String cadena[]= valorStr.split("[.]");
		 return Double.parseDouble(cadena[0]+"."+cadena[1].substring(0, 2));
	 }
	
	
	
}
