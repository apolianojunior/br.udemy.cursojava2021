package estruturasDeControle;

import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		/*
		 * 7. Criar um programa que enquanto estiver recebendo números positivos,
		 * imprime no console a soma dos números inseridos, caso receba um número
		 * negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor");
		int valores = entrada.nextInt();
		int soma = 0;

		while (valores > 0) {
			soma += valores;
			System.out.println("A soma total é: " + soma);
			valores = entrada.nextInt();
		}
	}
}
