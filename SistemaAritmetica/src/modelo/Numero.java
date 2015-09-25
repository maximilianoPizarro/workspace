package modelo;

public class Numero {
	
	private int n;
	
	public Numero(int n){
		this.n=n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	/*
	  Es primo                                 (1)
	 Un n�mero natural p se dice que es primo si p>1 y si sus �nicos divisores positivos son 1 y p
	 
	 */
	public boolean esPrimo(){
		return (n>1)&&(n%1==0)&&(n%n==0);
	}
	/*
	 Son primos mellizos               (2)
		Dos n�meros primos se dice que son mellizos si su diferencia es 2, 
		por ejemplo 17 y 19 son primos mellizos
	*/
	
	public boolean esMellizo(Numero p){
		return ((n-p.getN()==2)||(p.getN()-n==2));
	}
	
	
	public boolean equals(Numero numero){
		return (n==numero.getN());
	}
	
	@Override
	public String toString(){
		return ("n: "+n);
	}

	

}