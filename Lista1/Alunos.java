import java.util.Scanner;

public class Alunos {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int nmenino, nmenina, phomem, pmulher, total;
		
		//leia  nmenino
		System.out.println("Digite o n�mero meninos:");
		nmenino = ler.nextInt();
		
		//leia  nmenina
		System.out.println("Digite o n�mero meninas:");
		nmenina = ler.nextInt();
		
		total = nmenino + nmenina;
		
		phomem = nmenino * 100 / total;
		
		pmulher = nmenina * 100 / total;
		
		//escreva phomen 
		System.out.println("A porcentagem de meninos �:" + phomem);
		ler.close();
	
		//escreva  pmulher
		System.out.println("A porcentagem de meninas �:" + pmulher);
		ler.close();
		
	}
}