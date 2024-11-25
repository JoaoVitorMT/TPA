package listavetor;

import java.util.Scanner;
public class divisores {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
			  
		 final int TAM = 10;
		 
		 int i,p, num, a[];
		 a = new int [TAM];
			  
			  
		 for( i = 0; i<TAM; i++){
				System.out.println( "digite o valor " + (i+1) +" do vetor A");
				a[i] = ler.nextInt();	
			}
		 
		 for ( i = 0; i < 10; i++) {
	            num = a[i];
	           
	            System.out.println("\n");
	            
	            System.out.print("Divisores de " + num + ": ");
	            
	            System.out.println("\n");
	            
	            for ( p = 1; p < num; p++) {
	               
	            	if (num % p == 0) {  
	                    
	                	System.out.println(  p );
	                }
	            }
	            System.out.println("\n");
	}  
 }	 
}
