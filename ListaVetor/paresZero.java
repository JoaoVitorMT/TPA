package listavetor;

import java.util.Scanner;
public class paresZero {
	public static void main(String[] args) {
		

	 Scanner ler = new Scanner(System.in);
		
	 	final int TAM = 10;
		 
		int i, a[], num, p ;
		 a = new int [TAM];
		 
		 for( i = 0; i<TAM; i++){
				System.out.println( "digite o valor " + (i+1) +" do vetor A");
				a[i] = ler.nextInt();	
			}
		 
		 
		 for ( i = 0; i < 10; i++) {
	            num = a[i];
	            
	            System.out.println("\n");
	            
	            System.out.println( "Divisores pares do número " + num + " :" );
	            
	            System.out.println("\n");
	         
	            for ( p = 0; p <= num; p++) {
	               
	            	
	            	
	            	if (p % 2 == 0) {  
	                    
	            		
	            		
	                	System.out.println(  p + ", " + num  );
	                }else {
	                	
	                }
	            }
	           
	        }
		 
		
		 
		 ler.close();
}
}
