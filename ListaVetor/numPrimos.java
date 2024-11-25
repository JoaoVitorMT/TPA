package listavetor;

import java.util.Scanner;
public class numPrimos {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
			final int TAM = 10;
			 
			 int i, num, r, r2, a[], j;
			 a = new int [TAM];
			
			 for( i = 0; i<TAM; i++) {
					System.out.println( "digite o valor " + (i+1) +" do A:");
					a[i] = ler.nextInt();	
				}
			 
			 for(i = 0; i < TAM; i++ ) {
			 
			 num = a[i];
			 
			 r2 = 0;
				
				if (num < 0) {
					
					System.out.println("digite apenas números positivos");
					
				}else  {
				
				for(j = 1; j <= num; j++ ) {
				
					r = num % j;
					
					if(r == 0 ) {
						
						r2++;
						
					}
				}
			}
				
			
				 if (r2 == 2 ) {
					
					System.out.println("O número " + num +" é primo ");
					 
				}else {
					
					System.out.println("O número "+ num +"  não é primo ");
					
				}
				 
			 }	
					
					
				ler.close();
}
}
