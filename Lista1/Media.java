import java.util.Scanner;

public class Media {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);

		double nota1, nota2, nota3, media;
		
		//leia  nota1
		System.out.println("Digite a sua primeira nota:");
		nota1 = ler.nextDouble();
		
		//leia  nota2
		System.out.println("Digite a sua segunda nota:");
		nota2 = ler.nextDouble();
		
		//leia  nota3
		System.out.println("Digite a sua terceira nota:");
		nota3 = ler.nextDouble();
		
		media = nota1 + nota2 + nota3 / 3;
		
		//escreva salariofinal
		System.out.println("A sua media:" + media);
		ler.close();
		
	}
}