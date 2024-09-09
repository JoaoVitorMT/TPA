package exercicios;


public class altura {
	public static void main(String[] args) {
		double j = 134 , p = 145 ;
		int i = 1;
		
		while( p > j ) {
			
			j = j + 2.5;
			
			p = p + 2;
			
			i++;
			
		}
		
		System.out.println("A altura de João em relação a de Pedro será maior em :  " + i);
	}

}
