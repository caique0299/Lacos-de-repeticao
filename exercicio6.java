package LAÇOSDEREPETIÇÃO;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Nome do colaborador: ");
	    String nome = sc.nextLine();

	    System.out.print("Código do cargo (1 a 6): ");
	    int codigoCargo = sc.nextInt();

	    System.out.print("Salário: R$ ");
	    float salario = sc.nextFloat();

	    float reajuste = 0;

	    switch (codigoCargo) {
	      case 1:
	        reajuste = 0.1f;
	        System.out.println("Cargo: Gerente");
	        break;
	      case 2:
	        reajuste = 0.07f;
	        System.out.println("Cargo: Vendedor");
	        break;
	      case 3:
	        reajuste = 0.09f;
	        System.out.println("Cargo: Supervisor");
	        break;
	      case 4:
	        reajuste = 0.06f;
	        System.out.println("Cargo: Motorista");
	        break;
	      case 5:
	        reajuste = 0.05f;
	        System.out.println("Cargo: Estoquista");
	        break;
	      case 6:
	        reajuste = 0.08f;
	        System.out.println("Cargo: Técnico de TI");
	        break;
	      default:
	        System.out.println("Código do cargo inválido!");
	        System.exit(0);
	    }

	    float novoSalario = salario + (reajuste * salario);
	    System.out.printf("Novo salário: R$ %.2f", novoSalario);

	    sc.close();
	  }
}
