package conceitosBasicos;

public class Questao6 {

	public static void main(String[] args) {
		// 6) Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
		// utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
		// Encontre o delta

		double a = 1;
		double b = 12;
		double c = -13;

		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("O valor do delta é: " + delta);
		double equacaopositiva = b + Math.sqrt(delta);
		equacaopositiva = equacaopositiva / (2 * a);

		double equacaonegativa = -b + Math.sqrt(delta);
		equacaonegativa = equacaonegativa / (2 * a);

		System.out.println("O resultado da equacao é: " + equacaopositiva + " ou " + equacaonegativa);

	}

}
