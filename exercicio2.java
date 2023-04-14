package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class exercicio2 {

	public class ParImparPositivoNegativo {

	    public static void main(String[] args) {
	    	
	        Scanner entrada = new Scanner(System.in);
	        int numero;
	        System.out.print("Digite um número: ");
	        numero = entrada.nextInt();
	        
	        if (numero % 2 == 0) {
	            if (numero > 0) {
	                System.out.println("O número " + numero + " é par e positivo!");
	            } else if (numero < 0) {
	                System.out.println("O número " + numero + " é par e negativo!");
	            } else {
	                System.out.println("O número " + numero + " é par e neutro!");
	            }
	        } else {
	            if (numero > 0) {
	                System.out.println("O número " + numero + " é ímpar e positivo!");
	            } else if (numero < 0) {
	                System.out.println("O número " + numero + " é ímpar e negativo!");
	            } else {
	                System.out.println("O número " + numero + " é ímpar e neutro!");
	            }
	        }
	        
	        entrada.close();
	    }
	}}
