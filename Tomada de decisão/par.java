package tomadadecisao;

import java.util.Scanner;

public class par {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n,r;
	
	System.out.println("coloque um n�mero:");
	n = ler.nextInt();
	
	r= n%2;
	
	System.out.println("O resto � " + r);
	
		if(r == 0)  {
		System.out.println(" par");

		
	   }else {
		  System.out.println("impar");
		  	  }
		ler.close();

	}
	
	
}



