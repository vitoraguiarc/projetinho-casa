import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String comodo, decisao = "S";
		double largura,comprimento,areaComodo, areaTotal = 0;
		
		System.out.println("-------------------------------");
		System.out.println("  Calculo de �rea de uma casa  ");
		System.out.println("-------------------------------");
		
		System.out.println();
		
		while (decisao.equals("S") || decisao.equals("s")) {
			System.out.print("Qual o nome do c�modo? ");
			comodo = leitor.next();
			
			System.out.print("Qual a largura? ");
			largura = leitor.nextDouble();
			
			System.out.print("Qual o comprimento? ");
			comprimento = leitor.nextDouble();
			
			areaComodo = comprimento * largura;
			
			areaTotal = areaComodo + areaTotal;
			
			System.out.println("O(A) " + comodo + " tem " + areaComodo + " metros quadrados." );
			
			System.out.println(); 
			
			System.out.print("Voc� deseja calcular mais c�modos(S/N)? ");
			decisao = leitor.next();
		} 
		
			System.out.println("A �rea total da casa � " + areaTotal +  " metros quadrados.");
			System.out.println();
			System.out.println("FIM");
		
		 

			
		} 
			
			
			
			
			
			
	
		
		
		

	}


