package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class exercicio7 {

	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Digite o 1º número: ");
	        float numero1 = sc.nextFloat();
	        
	        System.out.print("Digite o 2º número: ");
	        float numero2 = sc.nextFloat();
	        
	        System.out.print("Operação (1:Soma, 2:Subtração, 3:Multiplicação, 4:Divisão): ");
	        int operacao = sc.nextInt();
	        
	        float resultado = 0;
	        
	        switch (operacao) {
	            case 1: // Soma
	                resultado = numero1 + numero2;
	                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, resultado);
	                break;
	            case 2: // Subtração
	                resultado = numero1 - numero2;
	                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, resultado);
	                break;
	            case 3: // Multiplicação
	                resultado = numero1 * numero2;
	                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, resultado);
	                break;
	            case 4: // Divisão
	                if (numero2 == 0) {
	                    System.out.println("Não é possível dividir por zero!");
	                } else {
	                    resultado = numero1 / numero2;
	                    System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, resultado);
	                }
	                break;
	            default:
	                System.out.println("Operação Inválida!");
	                break;
	        }
	        
	        sc.close();

	    }
}
