package conceitosBasicos;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// 4) Criar um programa que leia um valor e apresente os resultados ao quadrado
		// e ao cubo do valor.

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor a ser calculado:");
		double valor = entrada.nextDouble();

		double valor2 = Math.pow(valor, 2);
		double valor3 = Math.pow(valor, 3);

		System.out.println("O valor ao quadrado é: " + valor2);
		System.out.println("O valor ao cubo é: " + valor3);

		entrada.close();

	}

}
