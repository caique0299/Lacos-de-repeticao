package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        boolean primeiraDoacao;
        System.out.print("Digite o Nome do doador: ");
        nome = entrada.nextLine();
        System.out.print("Digite a Idade do doador: ");
        idade = entrada.nextInt();
        System.out.print("Primeira doação de sangue? ");
        primeiraDoacao = entrada.nextBoolean();
        
        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && primeiraDoacao) {
                System.out.println(nome + " não está apto para doar sangue!");
            } else {
                System.out.println(nome + " está apto para doar sangue!");
            }
        } else {
            System.out.println(nome + " não está apto para doar sangue!");
        }
        
        entrada.close();
    }
}
