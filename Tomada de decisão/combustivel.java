package exTomadadecicao;

import java.util.Scanner;

public class combustivel {

	public static void main(String [] args) {

		Scanner ler= new Scanner(System.in);
	
		double ct, km, gm;
	
		System.out.println("digite a distância em KM");
		km = ler.nextDouble();
		
		System.out.println(" digite a capacidade do tanque");
		ct = ler.nextDouble();
		
		gm = km / ct;
		
		System.out.println("seu gasto medio é:" + gm);
		

		if(gm>=10) {
			
			System.out.println(" econômico");
			
	 } else {
		
		System.out.println("Não econômico ");
	
	
		ler.close();
	
	 }
		
	}
}
