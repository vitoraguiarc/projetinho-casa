import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("-------------------------------");
		System.out.println("  Calculo de área de uma casa  ");
		System.out.println("-------------------------------");
		
		System.out.println();
		
		System.out.print("Qual o nome do cômodo? ");
		String comodo = leitor.next();
		
		System.out.print("Qual a largura? ");
		double largura = leitor.nextDouble();
		
		System.out.print("Qual o comprimento? ");
		double comprimento = leitor.nextDouble();
		
		double areaComodo = comprimento * largura;
		
		System.out.println("O(A) " + comodo + " tem " + areaComodo + " metros quadrados." );
		
		System.out.println(); 
		
		System.out.print("Você deseja calcular mais cômodos(S/N)? ");
		String decisao = leitor.next();
		decisao.equals("S");
		
		while (decisao.equals("S") || decisao.equals("s")) {
			System.out.print("Qual o nome do cômodo? ");
			String comodo1 = leitor.next();
			
			System.out.print("Qual a largura? ");
			double largura1 = leitor.nextDouble();
			
			System.out.print("Qual o comprimento? ");
			double comprimento1 = leitor.nextDouble();
			
			double areaComodo1 = comprimento1 * largura1;
			
			System.out.println("O(A) " + comodo1 + " tem " + areaComodo1 + " metros quadrados." );
			
			System.out.println(); 
			
			System.out.print("Você deseja calcular mais cômodos(S/N)? ");
			String decisao1 = leitor.next();
		} 
		
			System.out.println("A área total da casa é " + areaComodo +  "metros quadrados.");
		
		 

			
		} 
			
			
			
			
			
			
	
		
		
		

	}


