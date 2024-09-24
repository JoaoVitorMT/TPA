package exdo;

import java.util.Scanner;
public class peso {
	 public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 
		 double pi, a;
		 String resposta, s;
		 
		
		 
		 do {
			 System.out.println("informe seu sexo: ");
			 s = ler.next();
			 
			 
			 System.out.println("informe sua altura  :  ");
			 a = ler.nextDouble();
			 
			 switch(s) {
			 
			 case "f":
				 
				 pi = 52 + ( 0.67 * ( a - 152.4));
				 System.out.println("Esse é seu peso ideal: " + pi);
			
			break;
			 case "m":
				
				 pi = 52 + ( 0.75 * ( a - 152.4));
				 System.out.println("Esse é seu peso ideal: " + pi);
			
			break;
			 default:
					System.out.println("sexo invalido");
			 }
			 
			 System.out.println("Você deseja continua? Se sim presione S, se não presione N");
			 resposta = ler.next();
			 
		 }while (resposta.equalsIgnoreCase("S"));
			
		 ler.close();
	 }
}
