import java.util.Scanner;

public class ProdutoDesconto {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);

		double preco, desconto, precofinal;
		
		
		//leia  produto
		System.out.println("Digite o pre�o do produto:");
		preco = ler.nextDouble();
		
		
		//leia  desconto
		System.out.println("Digite o desconto do produto:");
		desconto = ler.nextDouble();
		
		precofinal = preco - (desconto / 100);
		
		//escreva precofinal
		System.out.println("O pre�o final �:" + precofinal);
		ler.close();
	}	
}
