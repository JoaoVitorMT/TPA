import java.util.Scanner;

public class Media {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media;
		
		//Leia Nota1
		System.out.println("Digite a primeira Nota:");
		nota1 = ler.nextDouble();
		
		//Leia Nota2
		System.out.println("Digite a segunda Nota:");
		nota2 = ler.nextDouble();
		
		media=(nota1 + nota2)/2;
		
		//Escreva M�dia
		System.out.println("Sua m�dia �:" + media);
	
		ler.close();
		
	}
}
