package estruturasDeControle;

import java.util.Scanner;

public class Questao8 {

	/*
	 * 8. Criar um programa que receba uma palavra e imprime no console letra por
	 * letra.
	 */
	
	public static void main(String[] args) {
		System.out.println("Digite a palavra");
		Scanner entrada = new Scanner(System.in);
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
			
		}
		
	}
	
	
	
	
}
