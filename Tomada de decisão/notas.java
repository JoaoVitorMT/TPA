package exTomadadecicao;

import java.util.Scanner;

public class notas {
	public static void main(String [] args) {

		Scanner ler= new Scanner(System.in);
	
		double a, b, c, m, nm;
	
		System.out.println("digite sua primeira nota ");
		a = ler.nextDouble();
		
		System.out.println("digite o segunda nota");
		b = ler.nextDouble();
	
		m = (a + b ) / 2;
		
		System.out.println("sua nota é : " + m);
		
		if(m<=3) {

			System.out.println("reprovado");
			
		} else if( m>=6){	
		
		System.out.println("aprovado");
		   
        } else {	
       
        	System.out.println("Em exame");
        	
        	System.out.println();

    	System.out.println("digite sua nova nota");
    	c = ler.nextDouble();
        
        nm = (m + c) / 2;
        
    	System.out.println("sua nova nota é:" + nm);
        
        if(nm>=6) {
        	
        	System.out.println("Aprovado");
        
        } else {	
        
    			System.out.println("reprovado");
    			
      ler.close();
        
   }
 }
}
}