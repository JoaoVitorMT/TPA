import java.util.Scanner;

public class Parede {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double l, c, q;
		
		//leia  largura
		System.out.println("Digite a largura:");
		l = ler.nextDouble();
		
		//leia  comprimento
		System.out.println("Digite o comprimento:");
		c = ler.nextDouble();
		
		q = (l*c)/3.8; 
		
		//escreva quantidade
		System.out.println("quantidade final:" + q);
		ler.close();
	}
}
