package exTomadadecicao;

import java.util.Scanner;

public class bhaskara {
	public static void main(String [] args) {

		Scanner ler= new Scanner(System.in);
	
		double a, b, c, d, r, r1, r2;
	
		System.out.println("digite o primeiro valor");
		a = ler.nextDouble();
		
		System.out.println("digite o segundo valor");
		b = ler.nextDouble();
		
		System.out.println("digite o terceiro valor");
		c = ler.nextDouble();
		
		d = (b*b) - 4 *a*c;
		
           if(d<5) {
			
			System.out.println(" não existe raizes reais");
			
	} else if(d==0){
		
		System.out.println("Existe uma raiz real");
		
		r = -b + Math.sqrt (d) / (2*a);	
	
	System.out.println(" A raiz é: " + r);
	
	 } else {	
		
		System.out.println("Existem duas raizes reais");
		   
		r1 = -b + Math.sqrt (d) / (2*a);	  
		
		r2 = -b + Math.sqrt (d) / (2*a);	
		
		System.out.println(" A raiz 1 é: " + r1 + " a raiz 2 é:" + r2);
		
		ler.close();
    }
	}
}
