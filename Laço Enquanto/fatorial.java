package exercicios;

import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int f,i ;
		
		System.out.println("Insira o n�mero que se deseja obter o fatorial:  ");
		f = ler.nextInt();
		
		if(f<0) {
			System.out.println("N�mero inv�lido");
		}else {
			
			i = f - 1;
							
			while( i>1) {

				f = f * i;
				
			
				i --;
		
			}
			
			System.out.println("seu fatorial � : " + f );
			
		}
	
		ler.close();
	}
	
}