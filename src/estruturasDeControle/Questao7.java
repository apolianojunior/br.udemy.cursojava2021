package estruturasDeControle;

import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		/*
		 * 7. Criar um programa que enquanto estiver recebendo n�meros positivos,
		 * imprime no console a soma dos n�meros inseridos, caso receba um n�mero
		 * negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor");
		int valores = entrada.nextInt();
		int soma = 0;

		while (valores > 0) {
			soma += valores;
			System.out.println("A soma total �: " + soma);
			valores = entrada.nextInt();
		}
	}
}
