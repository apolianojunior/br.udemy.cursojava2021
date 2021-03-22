package estruturasDeControle;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		// 5. Refatorar o exerci�?cio 04, utilizando a estrutura switch.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o numero a ser verificado");
		int valor = entrada.nextInt();
		int primo = 0;

		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				primo++;
			}
		}

		switch (primo) {
		case 0:
			System.out.println("O valor " + valor + " é um número primo");
			break;

		default:
			System.out.println("O valor " + valor + " não é um número primo");
		}

		entrada.close();

	}

}
