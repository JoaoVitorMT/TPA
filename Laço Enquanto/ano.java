package exercicio;

import java.util.Scanner;

public class ano {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int ann, ana, id,  i = 1;
		
		while (i < 7 ) {
		
		System.out.println("Insira o ano atual: ");
		ana = ler.nextInt();
		
		System.out.println("Insira o ano de seu nascimento: ");
		ann = ler.nextInt();
		
		id = ana - ann;
		
		System.out.println("essa é sua idade:  " + id + ",");
		
		if (id < 18 )	{
			
			System.out.println("você é menor de idade");
			
			} 	else {
		
				System.out.println("você é maior de idade");
		
			}	
			
			i = i + 1;
			}
	
			ler.close();
	
	}
}
