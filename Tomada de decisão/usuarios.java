package exTomadadecicao;

import java.util.Scanner;

public class usuarios {
	public static void main(String [] args) {

		Scanner ler= new Scanner(System.in);
	
		String nome;
		
		String nn;

		String nv ;
	
		int id, idv, idn;
		
		System.out.println("digite seu nome");
		nome = ler.next();
		
		System.out.println("digite sua idade");
		id = ler.nextInt();
		
		
		nv = nome ;
		 
		idv = id ; 
		
		nn = nome ;
		
		idn = id;
		
		System.out.println("usuario mais velho : " + nv + " com a idade de:  "+ idv);
		
		System.out.println("usuario mais novo : " + nn + " com a idade de : "+ idn);
		
		System.out.println();

		
		System.out.println("digite seu nome");
		nome = ler.next();
		
		System.out.println("digite sua idade");
		id = ler.nextInt();
		
		if (idv>id){
			
			idn = id;
			
			nn = nome;
				
		
			
		  } else {	
		
			 System.out.println();

			System.out.println("digite seu nome");
			nome = ler.next();
			
			System.out.println("digite sua idade");
			id = ler.nextInt();
			
			if (idv<id){
				
				idv = id;
				
				nv = nome;
				
			
				
			  } else if (idn>id){
					
					idn = id;
					
					nn = nome;
	
			  }else {
				  
				  System.out.println();

				System.out.println("digite seu nome");
				nome = ler.next();
				
				System.out.println("digite sua idade");
				id = ler.nextInt();
				
			   if (idv<id){
					
				idv = id;
					
				nv = nome;
				
				
				
			  } else if(idn>id) {	
						
				idn = id;
					
				nn = nome;
					
				
			
			   }else {	
				   
				   System.out.println();

			   System.out.println("digite seu nome");
					nome = ler.next();
					
			  System.out.println("digite sua idade");
					id = ler.nextInt();
					
				 if (idv<id){
						
				idv = id;
				
				nv = nome;
					
					
					
				 } else {	
			
				idv = id;
			
				nv = nome;
					  }
				 System.out.println();


				System.out.println("usuario mais velho : " + nv + " com a idade de:  "+ idv);
					
				System.out.println("usuario mais novo : " + nn + " com a idade de : "+ idn);
			
					ler.close();
		
		
		  }
	}
  }
	}
}
	