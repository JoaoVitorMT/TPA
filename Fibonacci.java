package exercicios;

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, An = 0, At = 1, i, Pr;
		
		System.out.println("Insira um número :  ");
		n = ler.nextInt();
	
		i = n;
		
		while(i >= 1) {
			Pr = An + At;
			An = At;
			At = Pr;
			
			System.out.println(An + "," + At + "," + Pr);
			
			i = i - 1;
		}
		
		ler.close();
	}
}
