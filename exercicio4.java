package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra1, palavra2, palavra3;
        System.out.print("Digite a primeira palavra: ");
        palavra1 = entrada.nextLine();
        System.out.print("Digite a segunda palavra: ");
        palavra2 = entrada.nextLine();
        System.out.print("Digite a terceira palavra: ");
        palavra3 = entrada.nextLine();
        
        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("Aguia");
                } else if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Pomba");
                }
            } else if (palavra2.equalsIgnoreCase("mamifero")) {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Homem");
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Vaca");
                }
            }
        } else if (palavra1.equalsIgnoreCase("invertebrado")) {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Pulga");
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Lagarta");
                }
            } else if (palavra2.equalsIgnoreCase("anelideo")) {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Minhoca");
                } else if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Sanguessuga");
                }
            }
        }
        
        entrada.close();
    }
}
