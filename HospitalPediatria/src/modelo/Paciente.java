package modelo;

import java.util.GregorianCalendar;

public class Paciente {

	private String apellido;
	private String nombre;
	private long dni;
	private GregorianCalendar fechaDeNacimiento;
	private ObraSocial obraSocial;
	
	
	public Paciente(String apellido, String nombre, long dni, GregorianCalendar fechaDeNacimiento,
			ObraSocial obraSocial) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.obraSocial = obraSocial;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public GregorianCalendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public ObraSocial getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}
	
	public String toString(){
		
		return("Apellido: "+apellido+" Nombre:"+nombre+" DNI:"+dni+"Obra Social: "+obraSocial);
	
	}
	
	public boolean equals(Paciente p)
	{
	return(dni==p.getDni());	
	}
	
	public String traerFechaDeNacimiento()
	{
		return Funciones.traerFechaCorta(fechaDeNacimiento);
	}
	
	
	public String traerEdad(){
		int anio=0,mes=0,dia=0;
		GregorianCalendar f= new GregorianCalendar();
		
		/*Dias*/
		if(/*1*/(Funciones.esDiaMayor(fechaDeNacimiento,f)==true)&&(Funciones.esMesIgual(fechaDeNacimiento,f)==true)&&(Funciones.esAnioIgual(fechaDeNacimiento,f)==true)){
		anio=0;
		mes=0;
		dia=0;
		}
		
		if(/*2*/(Funciones.esDiaMayor(fechaDeNacimiento,f)==false)&&(Funciones.esMesIgual(fechaDeNacimiento,f)==true)&&(Funciones.esAnioIgual(fechaDeNacimiento,f)==true)){
			anio=0;
			mes=0;
			dia=Funciones.traerNroDia(f)-Funciones.traerNroDia(fechaDeNacimiento);
			}
		/*Meses*/
		if(/*3*/(Funciones.esDiaIgual(fechaDeNacimiento,f)==true)&&(Funciones.esMesMayor(fechaDeNacimiento,f)==false)&&(Funciones.esAnioIgual(fechaDeNacimiento,f)==true)){
			anio=0;
			mes=Funciones.traerNroMes(f)-Funciones.traerNroMes(fechaDeNacimiento);
			dia=0;
			}else
				{
				if(/*4*/(Funciones.esDiaIgual(fechaDeNacimiento,f)==true)&&(Funciones.esMesMayor(fechaDeNacimiento,f)==false)&&(Funciones.esAnioIgual(fechaDeNacimiento,f)==false)&&(Funciones.esAnioMayor(fechaDeNacimiento,f)==false))
				{	anio=Funciones.traerNroAnio(f)-Funciones.traerNroAnio(fechaDeNacimiento);
					mes=Funciones.traerNroMes(f)-Funciones.traerNroMes(fechaDeNacimiento);	
					dia=0;}else
					if(/*3*/(Funciones.esDiaIgual(fechaDeNacimiento,f)==false)&&(Funciones.esMesMayor(fechaDeNacimiento,f)==false)&&(Funciones.esAnioIgual(fechaDeNacimiento,f)==true)){
						anio=0;
						mes=Funciones.traerNroMes(f)-Funciones.traerNroMes(fechaDeNacimiento);
						if(Funciones.esDiaMayor(fechaDeNacimiento, f)==true){
							dia=Funciones.traerNroDia(fechaDeNacimiento)-Funciones.traerNroDia(f);
							}else{
							dia=Funciones.traerNroDia(f)-Funciones.traerNroDia(fechaDeNacimiento);
							}
					}
				}
		
		if(/*5*/(Funciones.esMesMayor(fechaDeNacimiento,f)==true)&&(Funciones.diferenciaAnioDeUno(fechaDeNacimiento,f)==false)){
			anio=0;
			mes=12-Funciones.traerNroMes(fechaDeNacimiento)+Funciones.traerNroMes(f);
			if(Funciones.esDiaMayor(fechaDeNacimiento,f)==true){
				dia=Funciones.cantidadDiasMesAnterior(fechaDeNacimiento)-Funciones.traerNroDia(fechaDeNacimiento)+Funciones.traerNroDia(f);
				}else{
				dia=Funciones.traerNroDia(f)-Funciones.traerNroDia(fechaDeNacimiento);	
			}
		}
	
		if(/*6*/(Funciones.esDiaIgual(fechaDeNacimiento,f)==false)&&(Funciones.esMesMayor(fechaDeNacimiento,f)==false)&&(Funciones.esAnioIgual(fechaDeNacimiento,f)==false)&&(Funciones.esAnioMayor(fechaDeNacimiento,f)==false))
		{anio=Funciones.traerNroAnio(f)-Funciones.traerNroAnio(fechaDeNacimiento);
		mes=Funciones.traerNroMes(f)-Funciones.traerNroMes(fechaDeNacimiento)-1;	
		dia=Funciones.cantidadDiasMesAnterior(f)-Funciones.traerNroDia(fechaDeNacimiento);}

		if(/*6*/(Funciones.esDiaMayor(fechaDeNacimiento,f)==false)&&(Funciones.esMesMayor(fechaDeNacimiento,f)==false)&&(Funciones.esAnioIgual(fechaDeNacimiento,f)==false)&&(Funciones.esAnioMayor(fechaDeNacimiento,f)==false))
		{anio=Funciones.traerNroAnio(f)-Funciones.traerNroAnio(fechaDeNacimiento);
		mes=Funciones.traerNroMes(f)-Funciones.traerNroMes(fechaDeNacimiento);	
		dia=Funciones.traerNroDia(f)-Funciones.traerNroDia(fechaDeNacimiento);}
		
		if(/*6*/(Funciones.esDiaMayor(fechaDeNacimiento,f)==true)&&(Funciones.esMesMayor(fechaDeNacimiento,f)==false)&&(Funciones.esAnioIgual(fechaDeNacimiento,f)==false)&&(Funciones.esAnioMayor(fechaDeNacimiento,f)==false))
		{anio=Funciones.traerNroAnio(f)-Funciones.traerNroAnio(fechaDeNacimiento);
		mes=Funciones.traerNroMes(f)-Funciones.traerNroMes(fechaDeNacimiento);	
		dia=Funciones.cantidadDiasMesAnterior(fechaDeNacimiento)-Funciones.traerNroDia(fechaDeNacimiento)+Funciones.traerNroDia(f);}

		
		return(anio+" año "+mes+" meses "+dia+" dias");
	}
		
}
			


