package outrosDesafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o 1 salário: ");
		String sal1 = entrada.nextLine();

		System.out.println("Digite o 2 salário: ");
		String sal2 = entrada.nextLine();

		System.out.println("Digite o 3 salário: ");
		String sal3 = entrada.nextLine();

		entrada.close();

		if (sal1.contains(",")) {
			sal1 = sal1.replace(",", ".");
		}

		if (sal2.contains(",")) {
			sal2 = sal2.replace(",", ".");
		}

		if (sal3.contains(",")) {
			sal3 = sal3.replace(",", ".");
		}

		double salario1 = Double.parseDouble(sal1);
		double salario2 = Double.parseDouble(sal2);
		double salario3 = Double.parseDouble(sal3);

		double soma = salario1 + salario2 + salario3;

		System.out.println(soma / 3);

	}

}
