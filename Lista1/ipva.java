package lista13Exerc�cios;
import java.util.Scanner;

public class ipva {
	public static void main  (String args[]) {
	Scanner ler = new Scanner(System.in);
	
	double valorcarro, ipva;

	System.out.println("Digite o valor do carro :");
	valorcarro = ler.nextInt();
	
	ipva = (valorcarro/100) * 4;
	
	System.out.println("O valor do IPVA � : " + ipva );
	ler.close();

}
}