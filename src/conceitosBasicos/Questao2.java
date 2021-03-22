package conceitosBasicos;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		// 2) Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		// °C = (°F -32) / 1, 8

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor em Fahrenheit:");
		double fahrenheit = entrada.nextDouble();
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.println("O valor em Celsius é: " + celsius);
		entrada.close();

	}

}
