package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[]args) {
		
		int a,b,c,soma;
			
			try (Scanner leia = new Scanner(System.in)) {
				System.out.println("\nEntre com a primeira nota: " );
						a = leia.nextInt();
						System.out.println("\nEntre com a segunda nota: " );
						b = leia.nextInt();
						System.out.println("\nEntre com a terceira nota: " );
						c = leia.nextInt();
			}
			
			soma = a+b;
					if(soma >c) {
						System.out.println("\n A soma de A+B é maior que C!!!");
						
					}else if(soma <c) {
					System.out.println("\nA soma de A+B é menor que C!!!");
					
					}else if(soma ==c) {
								System.out.println("\nA soma de A+B é igual a C!!!");
								
								System.out.printf("\n A+B: %.2F,soma ");
					}}
}
