package exTomadadecicao;

import java.util.Scanner;

public class idade {
	public static void main(String [] args) {

		Scanner ler= new Scanner(System.in);
	
		int dn,aa, i;
	
		System.out.println("digite seu ano de nascimento");
		dn = ler.nextInt();
		
		System.out.println("digite o ano atual");
		aa = ler.nextInt();
		
		i = aa - dn;
		
		System.out.println("sua idade é:" + i);
		
		if(i<10) {
			
			System.out.println(" criança");
			
	} else if(i>10 && i<18){
		
		System.out.println("adolecente");
		
	} else if(i>18 && i<60  ){	
		
		System.out.println("adulto");
		   
    } else {	
		
		System.out.println("idoso");
		
		ler.close();
	
	
	
	}	
	}
}