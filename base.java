package exercicios;

import java.util.Scanner;
public class base {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int b, e , i;
		
		System.out.println("Insira o número da base : ");
		 b = ler.nextInt();
		 
		 System.out.println("Insira o número do expoente : ");
		 e = ler.nextInt();
		
		 if( e == 0) {
			 
			 System.out.println("Sua  potência é : " + 1);
		
		 } else if (e == 1) {
		
			 System.out.println("Sua  potência é : " + b);
		 
		 }else {
			 
		 e = b;
		 
		 i = e;
		 
		
		
		  
		while( i > 1 ) {
			
			e = e * b;
		
			i--;
		
		}
		
		System.out.println("Sua  potência é : " + e);
		
		 }
		ler.close();
	
	}

}

