package exercicios;

import java.util.Scanner;
public class Nprimos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, n,  r, r2 = 1;
		
		System.out.println("Insira um n�mero inteiro: ");
		n = ler.nextInt();
		
		if (n < 0) {
			
			System.out.println("digite apenas n�meros positivos");
			
		}else  {
		
		r = n;
		
		i = 2;
		
		while(i <= n) {
		
			r = n % i;
			
			if(r == 0 ) {
				
				r2++;
				
			}
				
			i++;	
			
			}
					
		 if (r2 == 2 ) {
			
			System.out.println("O n�mero � primo ");
			 
		}else {
			
			System.out.println("O n�mero n�o � primo ");
			
		}
		ler.close();
	}
}
}
