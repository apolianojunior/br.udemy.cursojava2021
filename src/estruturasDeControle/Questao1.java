package estruturasDeControle;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// 1. Criar um programa que receba um nu�?mero e verifique se ele está entre 0 e
		// 10 e e�? par;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor a ser verificado");
		Integer valor = entrada.nextInt();

		if (valor > 10 || valor < 0) {
			System.out.println("O valor não dentro da seleção de 0-10");
		} else {
			for (int i = 0; i <= 10; i++) {
				if (valor == i && valor % 2 == 0) {
					System.out.println("O valor é " + i + " e ele é par!");
				} else if (valor == i && valor % 2 == 1) {
					System.out.println("O valor é " + i + " e não é par!");
				}

			}
		}
		entrada.close();
	}

}
