package listavetor;

import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 final int TAM = 5;
		 
		 int i, j, r, a[];
		 a = new int [TAM];


			for( i = 0; i<TAM; i++) {
				System.out.println( "digite o valor " + (i+1) +" do vetor A");
				a[i] = ler.nextInt();	
			}
		 
			for( i = 0; i<=10; i++) {
				for ( j = 0; j<=10; j++ ) {
			 
			 r = a[i] * j;
			 
			  System.out.println(a[i] + " x " + j + " = " + r);
		 }
		 System.out.println("\n");
		 
			
	}
			ler.close();
}
}

