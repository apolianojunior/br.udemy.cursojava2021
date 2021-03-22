package estruturasDeControle;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// 4. Criar um programa que receba um número e diga se ele e�? um número primo.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o numero a ser verificado");
		int valor = entrada.nextInt();
		int primo = 0;

		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				primo++;
			}
		}

		if (primo == 0) {
			System.out.println("O valor " + valor + " é um número primo");
		} else {
			System.out.println("O valor " + valor + " não é um número primo");
		}

		entrada.close();
	}
}
