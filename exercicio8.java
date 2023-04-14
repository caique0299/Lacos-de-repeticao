package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float saldo = 1000.00f;
        int operacao;
        
        System.out.println("Escolha a operação:");
        System.out.println("1 - Saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Depósito");
        operacao = sc.nextInt();
        
        switch(operacao) {
            case 1:
                System.out.printf("Saldo: R$ %.2f", saldo);
                break;
            case 2:
                float valorSaque;
                System.out.print("Valor do saque: R$ ");
                valorSaque = sc.nextFloat();
                if (valorSaque > saldo) {
                    System.out.println("Operação - Saque");
                    System.out.println("Saldo Insuficiente!");
                } else {
                    saldo -= valorSaque;
                    System.out.println("Operação - Saque");
                    System.out.printf("Novo Saldo: R$ %.2f", saldo);
                }
                break;
            case 3:
                float valorDeposito;
                System.out.print("Valor do depósito: R$ ");
                valorDeposito = sc.nextFloat();
                saldo += valorDeposito;
                System.out.println("Operação - Depósito");
                System.out.printf("Novo Saldo: R$ %.2f", saldo);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }
        
        sc.close();
    }
}
