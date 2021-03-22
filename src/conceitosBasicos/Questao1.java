package conceitosBasicos;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// 1) Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		// °F = °C × 1, 8 + 32

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor em Celsius:");
		double celsius = entrada.nextDouble();
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("O valor em Fahrenheit é: " + fahrenheit);
		entrada.close();

	}
}

