package exerciciocase;

import java.util.Scanner;
public class notas {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			double i, r, b, mb;
			int t;
			String mencao;
		System.out.println(" insira a menção desejada: ");
		mencao= ler.next();
		
		System.out.println(" insira quantos alunos tiraram I:  ");
		i= ler.nextDouble();
		
		System.out.println(" insira quantos alunos tiraram R : ");
		r= ler.nextDouble();
		
		System.out.println(" insira quantos alunos tiraram B : ");
		b= ler.nextDouble();
		
		System.out.println(" insira quantos alunos tiraram MB: ");
		mb= ler.nextDouble();
		
		
		
		t =  (int) (mb + b + r + i);
		
		switch(mencao) {
		case "I":
					i = ((i/t) * 100);
				System.out.println(" alunos com I: " + i + " % ");
		break;
		case "R":
					r = ((r/t) * 100);
			System.out.println(" alunos com R: " + r + " % ");
			break;
			case "B":
					b = ((b/t) * 100);
				System.out.println(" alunos com B:" + b + " % ");
		    break;
			case "MB":
					mb = ((mb/t) * 100);
				System.out.println(" alunos com MB: " + mb + " % ");
		    break;
			default:
				System.out.println(" valores invalidos ");
			
		ler.close();
		
		}
	}
}