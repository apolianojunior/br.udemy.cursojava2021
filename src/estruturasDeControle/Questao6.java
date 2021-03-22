package estruturasDeControle;

import java.util.Random;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		/*
		 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
		 * numero aleatório em uma varia�?vel. O Jogador tem 10 tentativas para adivinhar
		 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o número inserido e�? maior ou menor do que
		 * o número armazenado.
		 */

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		System.out.println("Digite seu palpite!");
		int guess = entrada.nextInt();
		int numeroAleatorio = aleatorio.nextInt(101);
		System.out.println(numeroAleatorio);

		for (int i = 9; i > 0; i--) {

			if (guess == numeroAleatorio) {
				System.out.println("Parabéns! Você acertou!");
				break;
			} else {
				if (guess > numeroAleatorio) {
					System.out.println("O seu palpite é maior do que o valor");
				} else {
					System.out.println("O seu palpite é menor do que o valor");
					}
				System.out.println("Tente novamente um novo número! Você só tem mais " + i + " chances!");
				guess = entrada.nextInt();
			}

		}
	}
}
