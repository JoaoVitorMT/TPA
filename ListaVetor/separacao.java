package listavetor;

import java.util.Scanner;
public class separacao {
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
		 
			final int TAM = 20;
			
			 
			 int i, a[], b[], n = 0;
			 
			a = new int [TAM];
			b = new int [TAM];
			
			for( i = 0; i<TAM; i++) {
				System.out.println( "digite o valor " + (i+1) +" do vetor A");
				a[i] = ler.nextInt();	
			}
				
			for (i = 0; i <20; i++) {
				if ( a[i] % 2 == 0) {
					
					b[n] = a[i] ;
					n++;
				}
			}

				for (i = 0; i <20; i++) {
				if( a[i] % 2 != 0) {
					
					b[n] = a[i];
					n++;
				
					
				}
			}

			System.out.print(" B = [");
			
			for( i = 0; i<TAM; i++) {
			
				if( i==19) {
				
					System.out.print(b[i]);
		
				}else {
				
					System.out.print(b[i] + ", ");
				
				}
			
			}
				System.out.println("]\n");

				
			ler.close();
		}
			
	}


