import java.util.Locale;
import java.util.Scanner;
public class Aulaassrincona {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		
	
		char operador;
		int resultado;
		int numero;
		
		
		System.out.println("Tabuada: ");
		numero = leia.nextInt();

		System.out.println("Me informe a operação: ");
		 operador = leia.next().charAt(0);
		 
		
		resultado = (numero + operador);
		
		
		 
		 
		if (operador == '*') {
			System.out.println("O resultado é!");
			}
			for(int contador = 0; contador <=10; contador++) {
		
				System.out.println("Tabuada" + contador);
				
			}
		 
			
		 if( operador == '-') {
			 System.out.println("Resultado é!: ");
		 }
		for(int contador = 0; contador <=10; contador++) {
			System.out.println("Tabuada:" + contador + resultado);
		}
		
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}
