package exercicios;

public class tabuada {
	public static void main(String[] args) {
		int  i = 1, m , r ;
	
		
		while(i<=10) {
		
			m = 1;
			
			r = 1;
			
			System.out.println( );
			
			System.out.println(" Número da tabuada atual: " + i + " .");
			
			System.out.println( );
		
			while(m<=10) {
				
				r = i * m;
				
			System.out.println( i + " X " + m + " = " + r);
			
			r++;
			m++;
			}
			i++;

		}	
	}
}