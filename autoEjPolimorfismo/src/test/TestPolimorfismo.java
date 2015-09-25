package test;

import modelo.Auto;

public class TestPolimorfismo {

	public static void main(String[] args) {
		
		Auto objAuto=new Auto("UNL014","XsL8f52MPstU" , 2014, "CHEVROLET");
		       
	    Auto objAuto1=objAuto;
	       
	    System.out.println("************ Escenario 1 ***********");
	       
	    System.out.println(objAuto);
	       
	    System.out.println(objAuto.equals(objAuto1));
	    
	    System.out.println("************ Escenario 2 ***********");
	      
	    Auto objAuto2=new Auto("UNL014","XsL8f52MPstU" , 2014, "CHEVROLET");
	        
	    System.out.println(objAuto);
	       
	    System.out.println(objAuto.equals(objAuto2));
	    
	     
	}

}
