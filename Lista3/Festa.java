import java.util.Scanner;

public class Festa {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int qh, qm, s, d;
		double b, be;
		
		//leia  homens
		System.out.println("Digite a quantidade de homens:");
		qh = ler.nextInt();
		
		//leia  mulheres
		System.out.println("Digite a quantidade de mulheres:");
		qm = ler.nextInt();
		
		s= qh*15 + qm * 10;
		d= qh*6 + qm * 8;
		b= ((qm+qh) * 100) / 1000;
		be= (qh * 600 + qm * 500) / 1000;
 
		
		//escreva salgados
		System.out.println("Salgados:" + s);
		
		
		//escreva doces
		System.out.println("Doces:" + d);
		
		
		//escreva bolo
		System.out.println("Bolo:" + b);
		
		
		//escreva bebidas
		System.out.println("Bebidas:" + be);
		
		
		ler.close();
	}
}

