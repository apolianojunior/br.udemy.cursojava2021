package outrosDesafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// ler num 1
		// ler num 2
		// perguntar ao usuario qual eh a operacao (+ - * / %)
		// nao pode usar if

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro número:");
		double num1 = entrada.nextDouble();
		System.out.println("Informe o segundo número:");
		double num2 = entrada.nextDouble();
		System.out.println("Informe o operador:");
		String op = entrada.next();

		double resultado = op.equals("+") ? num1 + num2 : 0;
		resultado = op.equals("-") ? num1 - num2 : resultado;
		resultado = op.equals("*") ? num1 * num2 : resultado;
		resultado = op.equals("/") ? num1 / num2 : resultado;
		resultado = op.equals("%") ? num1 % num2 : resultado;

		System.out.println("Resumo" + num1 + " + " + num2 + " = " + resultado);

		entrada.close();
	}

}
