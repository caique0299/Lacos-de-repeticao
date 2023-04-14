package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código do Produto: ");
        int codigo = sc.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        double preco = 0.0;
        String produto = "";

        switch (codigo) {
            case 1:
                preco = 10.00;
                produto = "Cachorro Quente";
                break;
            case 2:
                preco = 15.00;
                produto = "X-Salada";
                break;
            case 3:
                preco = 18.00;
                produto = "X-Bacon";
                break;
            case 4:
                preco = 12.00;
                produto = "Bauru";
                break;
            case 5:
                preco = 8.00;
                produto = "Refrigerante";
                break;
            case 6:
                preco = 13.00;
                produto = "Suco de Laranja";
                break;
            default:
                System.out.println("Código inválido!");
                System.exit(0);
        }

        double valorTotal = quantidade * preco;
        System.out.printf("Produto: %s\n", produto);
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);

        sc.close();
    }
}
