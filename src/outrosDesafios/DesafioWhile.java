package outrosDesafios;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		System.out.println("Digite uma nota:");
		Scanner entrada = new Scanner(System.in);
		Integer notafinal = entrada.nextInt();

		double contador = 0;
		double total = 0;

		while (notafinal != -1) {
			if (notafinal >= 0 && notafinal <= 10) {
				total += notafinal;
				contador++;
			} else {
				System.out.println("A nota digitada não é válida!");
			}

			System.out.println("Digite a próxima nota:");
			notafinal = entrada.nextInt();
		}
		
		System.out.println("O total de notas digitadas foram: "+contador);
		System.out.println("O somatório das notas digitadas foi: "+total);
		System.out.println("A média das notas digitadas foi: "+total/contador);

		entrada.close();

	}
}
