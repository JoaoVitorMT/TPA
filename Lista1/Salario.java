import java.util.Scanner;

public class Salario {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double salario, ndp, salariofinal;
		
		//leia  salario
		System.out.println("Digite o seu sal�rio:");
		salario = ler.nextDouble();
		
		//leia  ndp
		System.out.println("Digite o seu n�mero dependente:");
		ndp = ler.nextDouble();
		
		salariofinal = ( 55* ndp + salario);
		
		//escreva salariofinal
		System.out.println("o seu sal�rio final �:" + salariofinal);
		ler.close();
		
		
		
	}
}
