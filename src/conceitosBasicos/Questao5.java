package conceitosBasicos;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// 5) Criar um programa que leia o valor da base e da altura de um tri�ngulo e
		// calcule a �rea.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a base do tri�ngulo: ");
		double base = entrada.nextDouble();

		System.out.println("Digite a altura do tri�ngulo: ");
		double altura = entrada.nextDouble();

		double area = (base * altura) / 2;
		System.out.println("A �rea do tri�ngulo � de: " + area);

	}
}
