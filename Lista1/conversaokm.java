package lista13Exerc�cios;
import java.util.Scanner;

public class conversaokm {
	public static void main  (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double metros, km;
		
		System.out.println("Digite o valor em metros:");
		metros = ler.nextInt();

		km = metros / 1000;
		
		System.out.println("O resultado da convers�o �: " + km );
		ler.close();
}
}