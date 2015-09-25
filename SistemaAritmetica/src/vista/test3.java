package vista;
import modelo.Numero;

public class test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Utilizando for e imprimir los números primos hasta n
		Numero n= new Numero(30);
		Numero aux= new Numero(1);
		
		for(int i=1;i<=n.getN();i++){
			aux.setN(i);
			if(aux.esPrimo()==true){
			System.out.println("\n"+i);	
			}
		}

	}

}
