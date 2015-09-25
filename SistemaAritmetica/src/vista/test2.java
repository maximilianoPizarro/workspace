package vista;
import modelo.Numero;

public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generar los 2 escenarios para (2)
		Numero n= new Numero(17);
		System.out.println(n.getN()+"es mellizo de 18: "+n.esMellizo(new Numero(18)));
		System.out.println(n.getN()+"es mellizo de 19: "+n.esMellizo(new Numero(19)));
		

	}

}
