package exTomadadecicao;

import java.util.Scanner;

public class salario {
	public static void main(String [] args) {

		Scanner ler= new Scanner(System.in);
	
		double s, a, irpf;
	
		System.out.println(" digite o seu salario ");
		s = ler.nextDouble();
		
		System.out.println("digite a alíquota em porcentagem");
		a = ler.nextDouble();
	
		irpf = s*(a/100);
		
		System.out.println(" desconto do IRPF é:"  + irpf);

	   if(s<=1434.59) {
			
			System.out.println(" desconto do IRPF é:" + irpf);
			
	    } else if(s<=2866.70){
		
		System.out.println(" desconto do IRPF é:" + irpf);
		
	   } else if(s<=3562){	
		
		System.out.println(" desconto do IRPF é:" + irpf);
		   
      } else {	
		
      System.out.println(" desconto do IRPF é:" + irpf);
		
		ler.close();
	
      }
	}
}