import java.util.Scanner;

public class Idade {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int anoAtual, anoNasci, idade;
		
		//leia anoAtual
		System.out.println("Digite o Ano Atual:");
		anoAtual = ler.nextInt();
		
		//leia anosNasci
		System.out.println("Digite o ano de Nascimento:");
		anoNasci = ler.nextInt();
		
		idade = (anoAtual - anoNasci);
		
		//escreva Idade
		System.out.println("A idade � " + idade + " anos.");
		
		ler.close();
	}
	
}