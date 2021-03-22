package estruturasDeControle;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// 2. Criar um programa informa se o ano atual e�? um ano bissexto;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano a ser validado");
		int anoBissexto = entrada.nextInt();

		if (anoBissexto % 4 == 0) {
			System.out.println("O ano " + anoBissexto + " é bissexto!");
		} else {
			System.out.println("O ano " + anoBissexto + " não é bissexto!");

		}

		entrada.close();

	}
}
