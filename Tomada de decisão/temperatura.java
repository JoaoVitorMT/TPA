package listatomada;

import java.util.Scanner;

public class temperatura {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double f, c;
		System.out.println("Digite a temperatura em fahrenheit:");
		f = ler.nextDouble();
 
		c = f - 32 /1.8;
		
		System.out.println("temperatura em graus celsius � :" + c);
	
		if( c < 15)  {
			System.out.println(" Est� frio");
	
		 }else if(c >= 22) {
			  System.out.println(" Est� calor");
			  	  } else {
			  		System.out.println(" Est� neutro ");

		ler.close();
  }	
 }
}