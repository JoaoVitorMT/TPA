import java.util.Scanner;

public class AnosMeses {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int dia, mes, ano;
		
		//Ler o dia
		System.out.println("Digite a quantiedade de dias:");
		dia = ler.nextInt();
		
		ano = (dia/365);
		mes = (dia/30);
		
		//Apresente os anos e os dias
		
		System.out.println("os dias equivalem a: " + ano + " anos");
		System.out.println("Os dias equivalem a: " + mes + " meses");
		
		ler.close();
	}
}
