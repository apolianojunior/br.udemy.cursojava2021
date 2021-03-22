package desafios.EstruturasDeControle;

import java.util.Scanner;

public class Questao9 {
	public static void main(String[] args) {
		/*
		 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
		 */

		int maiorNumero = 0;

		System.out.println("Digite o valor!");
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();

		for (int i = 0; i < 10; i++) {

			if (valor > maiorNumero) {
				maiorNumero = valor;
			}

			System.out.println("Digite o próximo valor!");
			valor = entrada.nextInt();
		}
		System.out.println("O maior valor digitado foi: "+maiorNumero);
	}

}
