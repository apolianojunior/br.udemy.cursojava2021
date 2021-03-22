package estruturasDeControle;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
//3. Criar um programa que receba duas notas parciais, calcular a me�?dia final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contra�?rio imprime no console "Reprovado".

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota");
		double nota1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7.0) {
			System.out.println("Você foi aprovado com média " + media);
		} else if (media > 4.0 && media < 7.0) {
			System.out.println("Você obteve média " + media + " e por isso está de recuperação!");
		} else {
			System.out.println("Você foi reprovado com media " + media);
		}
		entrada.close();
	}

}
