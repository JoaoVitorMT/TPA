package listatomada;

 import java.util.Scanner;

public class numero {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double n;
		
		System.out.println("coloque um n�mero:");
		n = ler.nextDouble();
		
		if( n < 0)  {
			System.out.println(" Este n�mero � negativo");
		 }else if(n == 0) {
			  System.out.println("Este n�mero � neutro");
			  	  } else {
			  		System.out.println(" Este n�mero � positivo ");

		ler.close();
		
  }	
 }
}