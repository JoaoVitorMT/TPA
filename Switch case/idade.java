package exerciciocase;

import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		System.out.println("insira sua idade: ");
		i= ler.nextInt();
		
		switch(i) {
		   case 6:
			   System.out.println("dente de leite");
		   break;
		   case 7 :
			   System.out.println(" junior ");
		   break;
		   case 8:
			   System.out.println(" junior max ");
		   break;
		   case 9:
		   	System.out.println(" junior master ");
		   break;
		   case 10:
			   System.out.println("  master ");
		   break;
		   default:
			   System.out.println(" idade inválida ");
	
		ler.close();
		}
    }
}
