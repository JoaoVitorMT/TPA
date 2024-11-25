package listavetor;

import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		

	Scanner ler = new Scanner(System.in);
	
 	final int TAM = 10;
 	
 	int a[], b[], i, j, f, r, n;
	
	 a = new int[TAM];
	 b = new int[TAM];


		for( i = 0; i<TAM; i++) {
			System.out.println( "digite o valor " + (i+1) +" do vetor A");
			a[i] = ler.nextInt();	
		}

	 for(i = 1; i < 10; i++) {
		 
		 f = 1;
		 
		 n = a[i];
		  
		 for (j = 1; j <= n; j++) {
			 
		 f = f + f * (j - 1);
		 }
         b[i] = f; 
     }
	
			System.out.print(" B= [");
			for( i = 0; i<10; i++) {
				if( i==9) {
					System.out.print(b[i]);
				}else {
					System.out.print(b[i] + ", ");
				}
		}
			System.out.println("]\n");
       
		

	 ler.close();
	}
}
