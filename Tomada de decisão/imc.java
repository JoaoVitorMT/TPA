package exTomadadecicao;

import java.util.Scanner;

public class imc {
	public static void main(String [] args) {

		Scanner ler= new Scanner(System.in);
	
		double p,a, imc;
	
		System.out.println("digite o seu peso");
		p = ler.nextDouble();
		
		System.out.println("digite o sua altura");
		a = ler.nextDouble();
		
		imc = p /(a*a);
		
		System.out.println("seu IMC é:" + imc);
		
		if(imc<18.5) {
			
			System.out.println(" excesso de magressa");
			
	} else if(imc>18.5 && imc<25){
		
		System.out.println("Peso normal");
		
	} else if(imc>25 && imc<30  ){	
		
		System.out.println("excesso de peso");
		   
     } else if(imc>30 && imc<35 ){	
		
    	 System.out.println("Obesidade (Grau 1)");
		
     } else if(imc>35 && imc<40 ){	
 		
    	 System.out.println("Obesidade (Grau 2)");
		
     } else if(imc>40 ){	
 		
    	 System.out.println("Obesidade (Grau 3)");
		
    
 			
 		
 		ler.close();
	
	
	
	}	
	}

}
