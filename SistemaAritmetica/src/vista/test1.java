package vista;
import modelo.Numero;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generar los 2 escenarios para (1)
		Numero n= new Numero(1);
		
		System.out.println(n.getN()+" es primo: "+n.esPrimo());
		
		Numero n2 = new Numero(2);
		
		System.out.println(n2.getN()+" es primo: "+n2.esPrimo());
		
		
		
		

	}

}
